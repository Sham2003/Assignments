package com.training.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // ------------------ HashMap Demo ------------------
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Date");
        hashMap.put(2, "Blueberry"); 

        System.out.println("HashMap: " + hashMap);

        System.out.println("Value for key 3: " + hashMap.get(3));

        System.out.println("Contains key 2? " + hashMap.containsKey(2));
        System.out.println("Contains value 'Apple'? " + hashMap.containsValue("Apple"));

        hashMap.remove(4);
        System.out.println("After removing key 4: " + hashMap);

        System.out.println("Iterating HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        hashMap.replace(3, "Cherry", "Coconut");
        System.out.println("After replace: " + hashMap);

        hashMap.putIfAbsent(5, "Elderberry");
        System.out.println("After putIfAbsent: " + hashMap);

        hashMap.clear();
        System.out.println("After clear(): " + hashMap);

        // ------------------ TreeMap Demo ------------------
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Orange");
        treeMap.put(5, "Mango");
        treeMap.put(20, "Pineapple");
        treeMap.put(15, "Grapes");

        System.out.println("\nTreeMap (sorted by keys): " + treeMap);

        // get()
        System.out.println("Value for key 15: " + treeMap.get(15));

        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        System.out.println("Key higher than 10: " + treeMap.higherKey(10));
        System.out.println("Key lower than 10: " + treeMap.lowerKey(10));

        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        treeMap.remove(20);
        System.out.println("After removing key 20: " + treeMap);

        // replace()
        treeMap.replace(5, "Mango", "Papaya");
        System.out.println("After replace: " + treeMap);

        treeMap.putIfAbsent(25, "Kiwi");
        System.out.println("After putIfAbsent: " + treeMap);

        treeMap.clear();
        System.out.println("After clear(): " + treeMap);
    }
}
