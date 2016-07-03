package com.ranuka.model;

public class Customer {
	
public Customer(){
	
}
public Customer(int customerID, String CustomerFName, String CustomerLName,String CustomerAddress ){
	this.customerID = customerID;
	this.CustomerFName = CustomerFName;
	this.CustomerLName = CustomerLName;
	this.CustomerAddress =  CustomerAddress;
	
}
	
int customerID;
private String CustomerFName;
private String CustomerLName;
private String CustomerAddress;
private Account myaccounts;

public Account getMyaccounts() {
	return myaccounts;
}
public void setMyaccounts(Account myaccounts) {
	this.myaccounts = myaccounts;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerFName() {
	return CustomerFName;
}
public void setCustomerFName(String customerFName) {
	CustomerFName = customerFName;
}
public String getCustomerLName() {
	return CustomerLName;
}
public void setCustomerLName(String customerLName) {
	CustomerLName = customerLName;
}
public String getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(String customerAddress) {
	CustomerAddress = customerAddress;
}

}
