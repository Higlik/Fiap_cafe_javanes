package br.com.fintech.model;

public class AccountModel {
	
	
	
	public String accountName;
	public String bankAccountName;
	public String bankAccountType;
	public String accountType;
	
	
	public int userId;
	
	
	public AccountModel() {
		
	}
	
	public AccountModel(String accountName,	String bankAccountName, String bankAccountType, String accountType) {
		this.accountName = accountName;
		this.bankAccountName = bankAccountName;
		this.bankAccountType = bankAccountType;
		this.accountType = accountType;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
}
