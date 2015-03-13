package de.denschu.runkeeper.transformer;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import com.topografix.gpx._1._1.GpxType;
import com.topografix.gpx._1._1.WptType;

import de.denschu.runkeeper.domain.NewFitnessActivity;
import de.denschu.runkeeper.domain.WGS84;

public class GpxTransformer {

	public NewFitnessActivity transform(File file) throws JAXBException {
		NewFitnessActivity activity = new NewFitnessActivity();
		// Import GPX File
		JAXBContext jaxbContext = JAXBContext.newInstance(GpxType.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<GpxType> object = (JAXBElement<GpxType>) jaxbUnmarshaller.unmarshal(file);
		GpxType gpx = (GpxType) JAXBIntrospector.getValue(object);
		List<WptType> waypoints = gpx.getTrk().get(0).getTrkseg().get(0).getTrkpt();
		WptType firstWaypoint = waypoints.get(0);
		XMLGregorianCalendar startTime = firstWaypoint.getTime();
		long startTimeInMillis = startTime.toGregorianCalendar().getTimeInMillis();
		List<WGS84> wgs84List = new ArrayList<WGS84>();
		for (WptType waypoint : waypoints) {
			WGS84 wgs84 = new WGS84();
			wgs84.setLongitude(waypoint.getLon().doubleValue());
			wgs84.setLatitude(waypoint.getLat().doubleValue());
			if (waypoint.getEle() != null) {
				wgs84.setAltitude(waypoint.getEle().doubleValue());
			} else {
				wgs84.setAltitude(0d);
			}
			XMLGregorianCalendar time = waypoint.getTime();
			long timestampInMillis = time.toGregorianCalendar().getTimeInMillis();
			wgs84.setTimestamp(Double.valueOf(timestampInMillis - startTimeInMillis) / 1000);
			wgs84.setType("gps");
			wgs84List.add(wgs84);
		}
		// Set start and end
		wgs84List.get(0).setType("start");
		WGS84 lastwgs84 = wgs84List.get(wgs84List.size() - 1);
		lastwgs84.setType("end");
		// 2015-03-05T15:49:49.000Z
		// seconds: 3302.4058219168
		// duration: 3292.432
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:s", Locale.US);
		activity.setStart_time(dateFormat.format(startTime.toGregorianCalendar().getTime()));
		activity.setType("Running");
		activity.setPath(wgs84List.toArray(new WGS84[wgs84List.size()]));
		activity.setDuration(lastwgs84.getTimestamp());
		activity.setNotes("Imported");
		activity.setPost_to_facebook(false);
		activity.setPost_to_twitter(false);
		activity.setDetect_pauses(Boolean.TRUE);
		return activity;
	}
}
