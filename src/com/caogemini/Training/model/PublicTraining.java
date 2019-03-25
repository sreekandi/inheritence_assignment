package com.caogemini.Training.model;

public class PublicTraining extends Training{
	private int participants;

	public PublicTraining() {
		super();
		
	}

	public PublicTraining(int trainingId, String trainingsubject, double trainingfee,int participants) {
		super(trainingId, trainingsubject, trainingfee);
		this.participants=participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public double getOrderValue() {
		return  getTrainingfee()*participants;
	}

}
