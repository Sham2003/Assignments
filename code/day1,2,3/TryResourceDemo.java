package com.training.first;

class MyResource implements AutoCloseable {
	public MyResource() {
		System.out.println("Creating resource");
	}
	
    public void doSomething() {
        System.out.println("Using MyResource...");
    }
    
    public void failSomething() {
    	throw new RuntimeException("Hello fail");
    }

    @Override
    public void close() {
        System.out.println("Closing MyResource...");
    }
}

public class TryResourceDemo {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            System.out.println("Starting try block\n");
            resource.doSomething();
            resource.failSomething();
            System.out.println("Done Something\n");
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("SHS");
        } finally {
        	System.out.println("finally block");
        }
    }
}
