package com.training.first;

class AnyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AnyException(String string) {
		super(string);
	}

	public AnyException() {
		super();
	}

}

public class ExceptionDEmo {
	
	
	private static void checkMethod() throws AnyException {
		throw new AnyException();
	}
	
	
	public static void main(String[] args) throws AnyException {
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.err.print("Global:");
				System.err.println(e);
			}
		});
			int res = 10 / 10;
			System.out.println("Result "+ res);
			int[] arr = {1,2,3,4,5};
			for(int i=0; i<5; i++) {
				System.out.print(arr[i]);
			}
			String s = "";
			System.out.println(s.toLowerCase());
			checkMethod();
		
	}
}
