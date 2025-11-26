package com.training.first;

import java.util.Random;

public class Account {
    // Variables (fields)
    private String accountNumber;
    private String ifscCode;
    private String location;
    private String bankName;
    private double balance;
    public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	private int pin;
    
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", location=" + location
				+ ", bankName=" + bankName + ", balance=" + balance + ", pin=" + pin + "]";
	}
	public Account(String accountNumber, String ifscCode, String location, String bankName, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.location = location;
		this.bankName = bankName;
		this.balance = balance;
		Random rand = new Random();
        this.pin = 1000 + rand.nextInt(9000);
   }
	
	
}
