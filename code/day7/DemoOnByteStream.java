package com.training.day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnByteStream {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("assets/data.txt"));
		
		String data;
		int i = 0;
		while((data = r.readLine()) != null) 
			System.out.println("Line "+ i++ + " : "+ data);
		System.out.println("\nEOF Reached");
		r.close();
		
		
		BufferedWriter w = new BufferedWriter(new FileWriter("assets/data.txt"));
		
		w.write("ajsfajfkasf");
		w.close();
	}
}	
