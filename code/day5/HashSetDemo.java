package com.training.day5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 1. Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Apple"); // duplicate, will not be added

        System.out.println("Initial HashSet: " + set);

        // 2. Check size
        System.out.println("Size of HashSet: " + set.size());

        // 3. Check if element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));
        System.out.println("Contains 'Mango'? " + set.contains("Mango"));

        // 4. Remove element
        set.remove("Date");
        System.out.println("After removing 'Date': " + set);

        // 5. Iterate using for-each
        System.out.println("Iterating with for-each:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 6. Iterate using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 7. isEmpty check
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // 8. Clear all elements
        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Is HashSet empty now? " + set.isEmpty());
    }
}
