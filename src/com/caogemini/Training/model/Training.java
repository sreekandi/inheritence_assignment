package com.caogemini.Training.model;

public class Training {
	
	private int  trainingId;
	private String trainingsubject;
	private double trainingfee;
	
	
	
	public Training() {
		super();
		
	}



	public Training(int trainingId, String trainingsubject, double trainingfee) {
		super();
		this.trainingId = trainingId;
		this.trainingsubject = trainingsubject;
		this.trainingfee = trainingfee;
	}



	public int getTrainingId() {
		return trainingId;
	}



	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}



	public String getTrainingsubject() {
		return trainingsubject;
	}



	public void setTrainingsubject(String trainingsubject) {
		this.trainingsubject = trainingsubject;
	}



	public double getTrainingfee() {
		return trainingfee;
	}



	public void setTrainingfee(double trainingfee) {
		this.trainingfee = trainingfee;
	} 
	
	
	
	

}
