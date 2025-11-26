package com.training.day4;


class DBConnection {
	
	public String name = "Sham";
	
	private static DBConnection instance;
	private DBConnection() {
		System.out.println("Created Instance");
	}
	
	public static DBConnection getInstance() {
		System.out.println("Get Instance");
		if(instance == null) 
			instance = new DBConnection();
		return instance;
	}
	
	
}

public class DesignPattern1 {
	public static void main(String[] args) {
		DBConnection d1 = DBConnection.getInstance();
		
		System.out.println("d1 = "+ d1.hashCode());
		
		DBConnection d2 = DBConnection.getInstance();
		
		System.out.println("d2 = "+ d2.hashCode());
	}
}
