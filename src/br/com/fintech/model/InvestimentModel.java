package br.com.fintech.model;

import java.sql.Date;

public class InvestimentModel {

	public int id;
	public String investimentName;
	public float incomeInvestiment;
	public float taxInvestiment;
	public Date initialDate;
	public Date finalDate;
	public String investimentCategory;
	
	
	
	public InvestimentModel() {
		
	}
	
	public InvestimentModel(int id,	String investimentName, float incomeInvestiment, float taxInvestiment,
	Date initialDate, Date finalDate, String investimentCategory) {
		this.id = id;
		this.investimentName = investimentName;
		this.incomeInvestiment = incomeInvestiment;
		this.taxInvestiment = taxInvestiment;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.investimentCategory = investimentCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvestimentName() {
		return investimentName;
	}

	public void setInvestimentName(String investimentName) {
		this.investimentName = investimentName;
	}

	public float getIncomeInvestiment() {
		return incomeInvestiment;
	}

	public void setIncomeInvestiment(float incomeInvestiment) {
		this.incomeInvestiment = incomeInvestiment;
	}

	public float getTaxInvestiment() {
		return taxInvestiment;
	}

	public void setTaxInvestiment(float taxInvestiment) {
		this.taxInvestiment = taxInvestiment;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public String getInvestimentCategory() {
		return investimentCategory;
	}

	public void setInvestimentCategory(String investimentCategory) {
		this.investimentCategory = investimentCategory;
	}
	
	
	
	
	
}
