package de.denschu.runkeeper.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class WGS84 {
	private Double timestamp; // The number of seconds since the start of the activity
	private Double latitude; // The latitude, in degrees (values increase northward and decrease southward)
	private Double longitude; // The longitude, in degrees (values increase eastward and decrease westward)
	private Double altitude; // The altitude of the point, in meters
	private String type; // One of the following values: "start", "end", "gps", "pause", "resume", "manual"

	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
