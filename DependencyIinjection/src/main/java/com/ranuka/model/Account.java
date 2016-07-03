package com.ranuka.model;

public class Account {
	
public Account(){
	
}

public Account(int AccountID,long AccountBalance, String AccountType ){
	this.AccountID = AccountID;
	this.AccountBalance = AccountBalance;
	this.AccountType= AccountType;
}

	private int AccountID;
	private long AccountBalance;
	private String AccountType;
	
	public long widrowAccount(long amount){
		return AccountBalance-amount;
	}
	
	public long depositAccount(long amount){
		return AccountBalance+ amount;
	}
	
	public int getAccountID() {
		return AccountID;
	}
	public void setAccountID(int accountID) {
		AccountID = accountID;
	}
	public long getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	
	

}
