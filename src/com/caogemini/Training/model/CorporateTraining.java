package com.caogemini.Training.model;

public class CorporateTraining	extends Training {
	
	
	private int days;

	public CorporateTraining() {
		super();

	}

	public CorporateTraining(int trainingId, String trainingsubject, double trainingfee, int days) {
		super(trainingId, trainingsubject, trainingfee);
		this.days = days;

	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	public double getOrderValue() {
		return getTrainingfee()*days;
	}

}
