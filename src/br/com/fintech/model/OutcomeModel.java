package br.com.fintech.model;

import java.sql.Date;

public class OutcomeModel {
	
	public int id;
	public float outcomeValue;
	public Date outcomeDate;
	public String outcomeCategory;
	public String outcomeLocation;
	public String outcomeImage;
	
	
	
	public OutcomeModel() {
		
	}
	
	
	public OutcomeModel(int id, float outcomeValue, Date outcomeDate, String outcomeCategory, String outcomeLocation, String outcomeImage) {
		this.id = id;
		this.outcomeValue = outcomeValue;
		this.outcomeDate = outcomeDate;
		this.outcomeCategory = outcomeCategory;
		this.outcomeLocation = outcomeLocation;
		this.outcomeImage = outcomeImage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getOutcomeValue() {
		return outcomeValue;
	}


	public void setOutcomeValue(float outcomeValue) {
		this.outcomeValue = outcomeValue;
	}


	public Date getOutcomeDate() {
		return outcomeDate;
	}


	public void setOutcomeDate(Date outcomeDate) {
		this.outcomeDate = outcomeDate;
	}


	public String getOutcomeCategory() {
		return outcomeCategory;
	}


	public void setOutcomeCategory(String outcomeCategory) {
		this.outcomeCategory = outcomeCategory;
	}


	public String getOutcomeLocation() {
		return outcomeLocation;
	}


	public void setOutcomeLocation(String outcomeLocation) {
		this.outcomeLocation = outcomeLocation;
	}


	public String getOutcomeImage() {
		return outcomeImage;
	}


	public void setOutcomeImage(String outcomeImage) {
		this.outcomeImage = outcomeImage;
	}
	
	
	
}
