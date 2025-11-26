package com.training.day5;

import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    public String name;
    public int rollno;
    public int mark;

    public Student(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " (Roll: " + rollno + ", Marks: " + mark + ")";
    }
    
    @Override
    public int compareTo(Student o) {
    	return Integer.compare(mark, o.mark);
    }
}

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Student objects
        Vector<Student> students = new Vector<>();

        // Add custom objects
        students.add(new Student("Amit", 3, 78));
        students.add(new Student("Ram", 1, 85));
        students.add(new Student("Sham", 5, 67));
        students.add(new Student("Koushik", 2, 90));
        students.add(new Student("Zara", 4, 72));

        System.out.println("Original Vector:");
        System.out.println(students);

        Collections.sort(students, Comparator.comparingInt(s -> s.rollno));
        System.out.println("\nSorted by Roll Number:");
        System.out.println(students);


        students.trimToSize();
        Collections.sort(students, Comparator.comparingInt(s -> s.mark));
        System.out.println("\nSorted by Marks:");
        System.out.println(students);

        // Sort by name
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("\nSorted by Name:");
        System.out.println(students);

        // Iterate using for-each loop
        System.out.println("\nIterating with for-each loop:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Iterate using forEach + lambda
        System.out.println("\nIterating with forEach + lambda:");
        students.forEach(System.out::println);
    }
}
