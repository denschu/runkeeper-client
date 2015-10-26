package de.denschu.runkeeper.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

abstract public class AbstractService {

	public static final String BASE_URL = "https://api.runkeeper.com";

	protected HttpURLConnection createConnection(String url, String method, String token) throws IOException,
			MalformedURLException, ProtocolException {
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod(method);
		conn.setRequestProperty("Authorization", "Bearer " + token);
		return conn;
	}

	protected HttpURLConnection createConnectionForPost(String url, String method, String token) throws IOException,
			MalformedURLException, ProtocolException {
		HttpURLConnection conn = createConnection(url, method, token);
		conn.setRequestProperty("Content-Length", "nnn");
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		return conn;
	}

	protected <T> T read(HttpURLConnection conn, String contentType, Class<T> clazz) throws IOException {
		conn.setRequestProperty("Accept", contentType);
		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			return new ObjectMapper().readValue(rd, clazz);
		} finally {
			conn.disconnect();
		}
	}

	protected void post(HttpURLConnection conn, String contentType, Object object) throws JsonGenerationException, JsonMappingException, IOException {
		try {
			String value = new ObjectMapper().writeValueAsString(object);
			conn.setRequestProperty("Content-Type",contentType);
			conn.getOutputStream().write(value.getBytes());
			if (conn.getResponseCode() != 201) {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String response = "";
                String message;
                while ((message = bufferedReader.readLine()) != null){
                    response += message;
                }
				throw new IOException(conn.getResponseCode() + " "+ conn.getResponseMessage() + " " 
						+ response);
			}
		} finally {
			conn.disconnect();
		}
	}
}
