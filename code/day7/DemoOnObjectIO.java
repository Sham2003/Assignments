package com.training.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnObjectIO {
	
	public static void writeObject() throws FileNotFoundException, IOException {
		Bottle b = new Bottle(0, "Tupper", 12321, "Red");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("assets/bottleinfo.txt"));
		
		oos.writeObject(b);
		oos.close();
		
		System.out.println("Object written \n" + b);
	}
	
	public static void readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("assets/bottleinfo.txt"));
		
		Bottle b = (Bottle) oos.readObject();
		oos.close();
		System.out.println("Object read \n" +b );
	
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//writeObject();
		readObject();
	}
}
