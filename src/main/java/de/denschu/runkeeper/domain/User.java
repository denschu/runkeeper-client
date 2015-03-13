package de.denschu.runkeeper.domain;

public class User {
	private Integer userID;
	private String profile;
	private String settings;
	private String fitness_activities;
	private String strength_training_activities;
	private String background_activities;
	private String sleep;
	private String nutrition;
	private String weight;
	private String general_measurements;
	private String diabetes;
	private String records;
	private String team;
	private String change_log;

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public String getSettings() {
		return settings;
	}

	public void setFitness_activities(String fitness_activities) {
		this.fitness_activities = fitness_activities;
	}

	public String getFitness_activities() {
		return fitness_activities;
	}

	public void setStrength_training_activities(String strength_training_activities) {
		this.strength_training_activities = strength_training_activities;
	}

	public String getStrength_training_activities() {
		return strength_training_activities;
	}

	public void setBackground_activities(String background_activities) {
		this.background_activities = background_activities;
	}

	public String getBackground_activities() {
		return background_activities;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String getSleep() {
		return sleep;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return weight;
	}

	public void setGeneral_measurements(String general_measurements) {
		this.general_measurements = general_measurements;
	}

	public String getGeneral_measurements() {
		return general_measurements;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setRecords(String records) {
		this.records = records;
	}

	public String getRecords() {
		return records;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public String getChange_log() {
		return change_log;
	}

	public void setChange_log(String change_log) {
		this.change_log = change_log;
	}

}
