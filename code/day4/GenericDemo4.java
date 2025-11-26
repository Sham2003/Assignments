package com.training.day4;

public class GenericDemo4 {
	public static <T> void display(T data) {
		System.out.println("Data is " + data + " Type is " + data.getClass());
	}
	
	public static <T extends Number,U extends Number> Number add(T t1, U t2) {
		return t1.intValue() + t2.intValue();
	}
	
	public static void main(String[] args) {
		display("Hello");
		
		display(21414);
		
		display(add(1,2.35f));
	}
}
