package de.denschu.runkeeper.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class HeartRate {
	private Double timestamp; // The number of seconds since the start of the activity
	private Integer heart_rate; // The instantaneous heart rate, in beats per minute

	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getHeart_rate() {
		return heart_rate;
	}

	public void setHeart_rate(Integer heart_rate) {
		this.heart_rate = heart_rate;
	}
}
