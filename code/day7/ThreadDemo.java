package com.training.day7;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Thread is running...");
        Thread t = Thread.currentThread();
        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State: " + t.getState());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread Info:" + mainThread);
        System.out.println("Name: " + mainThread.getName());
        System.out.println("ID: " + mainThread.getId());
        System.out.println("Priority: " + mainThread.getPriority());
        System.out.println("State: " + mainThread.getState());

        ThreadDemo demo = new ThreadDemo();
        Thread t1 = new Thread(demo, "MyWorkerThread");


        
        Runnable r1 = () -> {
        	try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	Thread t = Thread.currentThread();
            System.out.println("Name: " + t.getName());
            System.out.println("ID: " + t.getId());
            System.out.println("Priority: " + t.getPriority());
            System.out.println("State: " + t.getState());
        	System.out.println("Runnable ended");
        };
        
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("Main Ended");
    }
}
