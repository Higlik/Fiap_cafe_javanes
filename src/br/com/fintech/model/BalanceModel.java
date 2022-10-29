package br.com.fintech.model;

public class BalanceModel {

	public float incomeTotal;
	public float outcomeTotal;
	public float investimentTotal;
	
	
	
	public BalanceModel() {
		
	}
	
	public BalanceModel(float incomeTotal,float outcomeTotal, float investimentTotal) {
		this.incomeTotal = incomeTotal;
		this.outcomeTotal = outcomeTotal;
		this.investimentTotal = investimentTotal;
	}

	public float getIncomeTotal() {
		return incomeTotal;
	}

	public void setIncomeTotal(float incomeTotal) {
		this.incomeTotal = incomeTotal;
	}

	public float getOutcomeTotal() {
		return outcomeTotal;
	}

	public void setOutcomeTotal(float outcomeTotal) {
		this.outcomeTotal = outcomeTotal;
	}

	public float getInvestimentTotal() {
		return investimentTotal;
	}

	public void setInvestimentTotal(float investimentTotal) {
		this.investimentTotal = investimentTotal;
	}
	
	
	
	
}
