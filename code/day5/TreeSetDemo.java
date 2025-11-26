package com.training.day5;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>();
        students.add(new Student("Amit", 3, 78));
        students.add(new Student("Ram", 1, 85));
        students.add(new Student("Sham", 5, 67));
        students.add(new Student("Koushik", 2, 90));
        students.add(new Student("Zara", 4, 72));
        
        students.forEach(System.out::println);
        System.out.println(students.floor(new Student("Kousik",5,68)));
        System.out.println(students);
	}
}
