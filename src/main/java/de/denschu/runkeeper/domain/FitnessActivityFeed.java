package de.denschu.runkeeper.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class FitnessActivityFeed {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Item {
		private String type; // The type of activity, as one of the following values: "Running", "Cycling", "Mountain Biking", "Walking", "Hiking",
								// "Downhill Skiing", "Cross-Country Skiing", "Snowboarding", "Skating", "Swimming", "Wheelchair", "Rowing",
								// "Elliptical", "Other"
		private String start_time; // The starting time for the activity (e.g., "Sat, 1 Jan 2011 00:00:00")
		private Double total_distance; // The total distance for the activity, in meters
		private Double duration; // The duration of the activity, in seconds
		private String uri; // The URI of the detailed information for the past activity

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStart_time() {
			return start_time;
		}

		public void setStart_time(String start_time) {
			this.start_time = start_time;
		}

		public Double getTotal_distance() {
			return total_distance;
		}

		public void setTotal_distance(Double total_distance) {
			this.total_distance = total_distance;
		}

		public Double getDuration() {
			return duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

	}

	private Integer size; // The total number of fitness activities across all pages;
	private Item[] items; // The user's activities, from newest to oldest
	private String previous; // The URI of the previous page in the user's feed (omitted for the oldest page)
	private String next; // The URI of the next page in the user's feed (omitted for the newest page)

	public FitnessActivityFeed() {
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}