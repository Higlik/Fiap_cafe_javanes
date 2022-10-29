package br.com.fintech.model;

import java.sql.Date;

public class IncomeModel {

	public int id;
	public float incomeValue;
	public Date incomeDate;
	public String incomeCategory;
	public String incomeLocation;
	public String incomeImage;
	
	
	public IncomeModel() {
		
	}
	
	public IncomeModel(int id, float incomeValue, Date incomeDate,String incomeCategory, 
	String incomeLocation, String incomeImage ) {
	 this.id = id;
	 this.incomeValue = incomeValue;
	 this.incomeDate = incomeDate;
	 this.incomeCategory = incomeCategory;
	 this.incomeLocation = incomeLocation;
	 this.incomeImage = incomeImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getIncomeValue() {
		return incomeValue;
	}

	public void setIncomeValue(float incomeValue) {
		this.incomeValue = incomeValue;
	}

	public Date getIncomeDate() {
		return incomeDate;
	}

	public void setIncomeDate(Date incomeDate) {
		this.incomeDate = incomeDate;
	}

	public String getIncomeCategory() {
		return incomeCategory;
	}

	public void setIncomeCategory(String incomeCategory) {
		this.incomeCategory = incomeCategory;
	}

	public String getIncomeLocation() {
		return incomeLocation;
	}

	public void setIncomeLocation(String incomeLocation) {
		this.incomeLocation = incomeLocation;
	}

	public String getIncomeImage() {
		return incomeImage;
	}

	public void setIncomeImage(String incomeImage) {
		this.incomeImage = incomeImage;
	}
	
	
	
}
