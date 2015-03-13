package de.denschu.runkeeper.services;

import java.io.File;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import de.denschu.runkeeper.domain.FitnessActivityFeed;

public class FitnessActivityServiceTest {

	public static final String TOKEN = "<your-access-token>";

	@Test
	@Ignore
	public void createFitnessActivityFromGpx() throws Exception {
		// Given
		File file = new File("src/test/resources/example.gpx");
		FitnessActivityService fitnessActivityService = new FitnessActivityService();
		// When
		fitnessActivityService.createFitnessActivityFromGpx(TOKEN, file);
		// Then	
	}

	@Test
	@Ignore
	public void createFitnessActivityTcx() throws Exception {
		// Given
		File file = new File("src/test/resources/example.tcx");
		FitnessActivityService fitnessActivityService = new FitnessActivityService();
		// When
		fitnessActivityService.createFitnessActivityFromTcx(TOKEN, file);
		// Then
	}
	
	@Test
	@Ignore
	public void deleteFitnessActivity() throws Exception {
		// Given
		FitnessActivityService fitnessActivityService = new FitnessActivityService();
		// When
		fitnessActivityService.deleteFitnessActivity(TOKEN, "");
		// Then
	}
	
	@Test
	@Ignore
	public void getFitnessActivityFeed() throws Exception {
		// Given
		FitnessActivityService fitnessActivityService = new FitnessActivityService();
		// When
		FitnessActivityFeed feed = fitnessActivityService.getFitnessActivityFeed(TOKEN);
		// Then
		Assert.assertNotNull(feed.getItems());
	}
}
