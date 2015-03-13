package de.denschu.runkeeper.services;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import de.denschu.runkeeper.domain.User;

public class UserServiceTest {

	public static final String TOKEN = "<your-token>";

	@Test
	@Ignore
	public void getUser() throws IOException {
		// Given
		// When
		User user = new UserService().getUser(TOKEN);
		// Then
		Assert.assertNotNull(user.getFitness_activities());
	}
}
