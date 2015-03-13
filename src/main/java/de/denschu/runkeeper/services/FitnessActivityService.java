package de.denschu.runkeeper.services;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

import de.denschu.runkeeper.ContentType;
import de.denschu.runkeeper.domain.FitnessActivity;
import de.denschu.runkeeper.domain.FitnessActivityFeed;
import de.denschu.runkeeper.domain.NewFitnessActivity;
import de.denschu.runkeeper.transformer.GpxTransformer;
import de.denschu.runkeeper.transformer.TcxTransformer;

public class FitnessActivityService extends AbstractService {

	public FitnessActivityFeed getFitnessActivityFeed(String accessToken) throws Exception {
		HttpURLConnection conn = createConnection(BASE_URL + "/fitnessActivities", "GET", accessToken);
		return read(conn, ContentType.FITNESS_ACTIVITY_FEED, FitnessActivityFeed.class);
	}

	public FitnessActivity getFitnessActivity(String accessToken, String id) throws Exception {
		HttpURLConnection conn = createConnection(BASE_URL + "/fitnessActivities" + "/" + id, "GET", accessToken);
		return read(conn, ContentType.FITNESS_ACTIVITY, FitnessActivity.class);
	}

	public void createFitnessActivityFromGpx(String accessToken, File gpxFile) throws Exception {
		NewFitnessActivity newFitnessActivity = new GpxTransformer().transform(gpxFile);
		createFitnessActivity(accessToken, newFitnessActivity);
	}
	
	public void createFitnessActivityFromTcx(String accessToken, File tcxFile) throws Exception {
		NewFitnessActivity newFitnessActivity = new TcxTransformer().transform(tcxFile);
		createFitnessActivity(accessToken, newFitnessActivity);
	}

	public void createFitnessActivity(String accessToken, NewFitnessActivity activity) throws Exception {
		HttpURLConnection conn = createConnectionForPost(BASE_URL + "/fitnessActivities", "POST", accessToken);
		post(conn, ContentType.NEW_FITNESS_ACTIVITY, activity);
	}

	public void deleteFitnessActivity(String accessToken, String id) throws Exception {
		HttpURLConnection conn = createConnection(BASE_URL + "/fitnessActivities" + "/" + id, "DELETE", accessToken);
		if (conn.getResponseCode() != 204) {
			throw new IOException(conn.getResponseMessage());
		}
		conn.disconnect();
	}
}
