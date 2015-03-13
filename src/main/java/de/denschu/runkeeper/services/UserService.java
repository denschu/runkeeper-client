package de.denschu.runkeeper.services;

import java.io.IOException;
import java.net.HttpURLConnection;

import de.denschu.runkeeper.ContentType;
import de.denschu.runkeeper.domain.User;

public class UserService extends AbstractService {
	public User getUser(String accessToken) throws IOException {
		HttpURLConnection conn = createConnection(BASE_URL + "/user", "GET", accessToken);
		return read(conn, ContentType.USER, User.class);
	}
}
