package com.training.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ListDemo {
	public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();
	        students.add(new Student("Amit", 3, 78));
	        students.add(new Student("Ram", 1, 85));
	        students.add(new Student("Sham", 5, 67));
	        students.add(new Student("Koushik", 2, 90));
	        students.add(new Student("Zara", 4, 72));

	        System.out.println("Before Sorting:");
	        System.out.println(students);

	        Collections.sort(students);
	        System.out.println("\nAfter Sorting by Roll Number:");
	        System.out.println(students);

	        Collections.sort(students, Comparator.comparingInt(s -> s.mark));
	        System.out.println("\nAfter Sorting by Marks:");
	        System.out.println(students);

	        Collections.sort(students, Comparator.comparing(s -> s.name));
	        System.out.println("\nAfter Sorting by Name:");
	        System.out.println(students);

	        Collections.sort(students, Comparator.comparingInt(s -> s.mark));
	        System.out.println("\nAfter Sorting by Marks (Descending):");
	        System.out.println(students);
	}
}
