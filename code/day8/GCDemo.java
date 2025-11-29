package com.training.day8;

public class GCDemo {
	public static void main(String[] args) throws InterruptedException {
		
		
		try(Test t = new Test() ){
			System.out.println("Test = " + t);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program ended");
		System.out.println("Garbage Collecting");
		
		Thread.sleep(1000);
		System.out.println("Completed");
		System.gc();
	}
}


class Test implements AutoCloseable {
	
	@Override
	protected void finalize() {
		System.out.println("Test memory destroyed");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Try Block Closed");
	}
}
