package com.training.first;

import java.util.Arrays;

class Fruit implements Comparable<Fruit> {
	private String name;
	private String color;
	private double price;
	
	public Fruit(String name, String color, double price) {
	   this.name = name;
	   this.color = color;
	   this.price = price;
	}
	
	@Override
	public String toString() {
	   return "Fruit{name='" + name + "', color='" + color + "', price=" + price + "}";
	}

	@Override
	public int compareTo(Fruit o) {
	    int nameCompare = this.name.compareTo(o.name);
	    if (nameCompare != 0) return nameCompare;

	    int colorCompare = this.color.compareTo(o.color);
	    if (colorCompare != 0) return colorCompare;

	    return Double.compare(this.price, o.price);
	}

}

public class ArraysDemo {
    public static void main(String[] args) {
        Fruit[] f1 = {
            new Fruit("Apple", "Red", 120.50),
            new Fruit("Banana", "Yellow", 40.00),
            new Fruit("Grapes", "Green", 90.75),
            new Fruit("Orange", "Orange", 60.25)
        };
        
        
        Fruit[] f2 = {
            new Fruit("Apple", "Red", 120.50),
            new Fruit("Banana", "Yellow", 40.00),
            new Fruit("Grapes", "Green", 90.75),
            new Fruit("Orange", "Orange", 60.25)
        };

        // Showcase Arrays methods
        System.out.println("Original f1: " + Arrays.toString(f1));

        // 1. sort
        Arrays.sort(f1);
        System.out.println("Sorted f1: " + Arrays.toString(f1));

        // 2. binarySearch
        int index = Arrays.binarySearch(f1, new Fruit("Banana", "Yellow", 40.00));
        System.out.println("Index of Banana: " + index);

        // 3. equals
        System.out.println("f1 equals f2? " + Arrays.equals(f1, f2));

        // 4. copyOf
        Fruit[] copy = Arrays.copyOf(f1, f1.length);
        System.out.println("Copy of f1: " + Arrays.toString(copy));

        // 5. fill
        Fruit[] filled = new Fruit[3];
        Arrays.fill(filled, new Fruit("Mango", "Yellow", 55.00));
        System.out.println("Filled array: " + Arrays.toString(filled));

        // 6. hashCode
        System.out.println("HashCode of f1: " + Arrays.hashCode(f1));

        // 7. deepEquals (for nested arrays)
        Fruit[][] nested1 = { f1 };
        Fruit[][] nested2 = { copy };
        System.out.println("Deep equals? " + Arrays.deepEquals(nested1, nested2));

        // 8. stream
        System.out.println("Stream print:");
        Arrays.stream(f1).forEach(System.out::println);
    }
}
