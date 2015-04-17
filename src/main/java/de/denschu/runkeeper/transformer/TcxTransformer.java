package de.denschu.runkeeper.transformer;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;

import com.garmin.xmlschemas.trainingcenterdatabase.v2.ActivityLapT;
import com.garmin.xmlschemas.trainingcenterdatabase.v2.ActivityT;
import com.garmin.xmlschemas.trainingcenterdatabase.v2.TrackT;
import com.garmin.xmlschemas.trainingcenterdatabase.v2.TrackpointT;
import com.garmin.xmlschemas.trainingcenterdatabase.v2.TrainingCenterDatabaseT;

import de.denschu.runkeeper.domain.HeartRate;
import de.denschu.runkeeper.domain.NewFitnessActivity;
import de.denschu.runkeeper.domain.WGS84;

public class TcxTransformer {

	public NewFitnessActivity transform(File file) throws JAXBException {
		NewFitnessActivity activity = new NewFitnessActivity();
		// Import TCX File
		JAXBContext jaxbContext = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<TrainingCenterDatabaseT> object = (JAXBElement<TrainingCenterDatabaseT>) jaxbUnmarshaller.unmarshal(file);
		TrainingCenterDatabaseT tcx = (TrainingCenterDatabaseT) JAXBIntrospector.getValue(object);
		Double totalDistance = 0d;
		Double totalTimeSeconds = 0d;
		XMLGregorianCalendar startTime = tcx.getActivities().getActivity().get(0).getId();
		long startTimeInMillis = startTime.toGregorianCalendar().getTimeInMillis();
		List<HeartRate> heartRateList = new ArrayList<HeartRate>();
		List<WGS84> wgs84List = new ArrayList<WGS84>();
		for (ActivityT tcxActivity : tcx.getActivities().getActivity()) {
			for (ActivityLapT lap : tcxActivity.getLap()) {
				totalDistance += lap.getDistanceMeters();
				totalTimeSeconds += lap.getTotalTimeSeconds();
				for (TrackT track : lap.getTrack()) {
					for (TrackpointT trackpoint : track.getTrackpoint()) {
						WGS84 wgs84 = new WGS84();
						if(trackpoint.getPosition() != null){
							wgs84.setLongitude(trackpoint.getPosition().getLongitudeDegrees());
							wgs84.setLatitude(trackpoint.getPosition().getLatitudeDegrees());	
						}else{
							continue;
						}
						wgs84.setAltitude(trackpoint.getAltitudeMeters());
						XMLGregorianCalendar time = trackpoint.getTime();
						long timestampInMillis = time.toGregorianCalendar().getTimeInMillis();
						Double seconds = Double.valueOf(timestampInMillis - startTimeInMillis) / 1000;
						wgs84.setTimestamp(seconds);
						wgs84.setType("gps");
						HeartRate heartrate = new HeartRate();
						heartrate.setHeart_rate(Short.valueOf(trackpoint.getHeartRateBpm().getValue()).intValue());
						heartrate.setTimestamp(seconds);
						heartRateList.add(heartrate);
						wgs84List.add(wgs84);
					}
				}
			}
		}
		wgs84List.get(0).setType("start");
		WGS84 lastwgs84 = wgs84List.get(wgs84List.size() - 1);
		lastwgs84.setType("end");
		// 2015-03-05T15:49:49.000Z
		// seconds: 3302.4058219168
		// duration: 3292.432
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:s", Locale.US);
		DateTime start = new DateTime(startTime.toGregorianCalendar().getTime());
		activity.setStart_time(dateFormat.format(start.getMillis()));
		activity.setType("Running");
		activity.setDetect_pauses(Boolean.TRUE);
		activity.setTotal_distance(totalDistance);
		activity.setPath(wgs84List.toArray(new WGS84[wgs84List.size()]));
		activity.setDuration(totalTimeSeconds);
		activity.setHeart_rate(heartRateList.toArray(new HeartRate[heartRateList.size()]));
		//activity.setNotes("Imported");
		activity.setPost_to_facebook(false);
		activity.setPost_to_twitter(false);
		activity.setDetect_pauses(Boolean.TRUE);
		return activity;
	}
}
