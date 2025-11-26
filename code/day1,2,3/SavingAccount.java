package com.training.first;

public class SavingAccount extends Account {

    public SavingAccount(String accountNumber, String ifscCode, String location, String bankName, 
                         double balance, int pin, double interestRate, int withdrawalLimit) {
        super(accountNumber, ifscCode, location, bankName, balance, pin);
    }




    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            System.err.println("Insufficient balance!");
            return false;
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Remaining balance: " + getBalance());
            return true;
        }
    }
    
    public void deposit(double amount) {
    	setBalance(getBalance() + amount);
    }

	@Override
	public String toString() {
		return "Saving " + super.toString();
	}

    
}
