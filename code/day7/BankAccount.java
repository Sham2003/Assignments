package com.training.day7;

public class BankAccount {

	private double balance = 15000;
	
	public void withdraw(double amount) {
		System.out.println(Thread.currentThread().getName()+" withdrwaing");
		synchronized (this) {
			if(amount>balance)
				System.out.println("insufficient balance");
			else {
				
				balance = balance-amount;
				System.out.println("Remaining balance: "+balance);
		    }
		}
	}
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		Runnable r =()->{
			acc.withdraw(14500);
		};
	
	
		Thread t1 = new Thread(r,"user1");
		Thread t2 = new Thread(r,"user2");
		
		t1.start();
		t2.start();
		System.out.println(t1 + "Started");
		System.out.println(t2 + "Started");
	}
}
	
	