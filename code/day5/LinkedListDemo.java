package com.training.day5;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Amit");
        list.add("Ram");
        list.add("Sham");
        System.out.println("After add: " + list);

         list.addFirst("First");
        list.addLast("Last");
        System.out.println("After addFirst & addLast: " + list);

        list.remove("Ram"); // remove by value
        System.out.println("After remove(\"Ram\"): " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.set(1, "Changed");
        System.out.println("After set(1, \"Changed\"): " + list);

        System.out.println("Contains Sham? " + list.contains("Sham"));

        System.out.println("Size: " + list.size());

        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Using ListIterator forward:");
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        
        Iterator<String> ditr = list.descendingIterator();
        System.out.println("Using Descending backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
        

        System.out.println("Using ListIterator backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        System.out.println("Using for-each loop:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("Using forEach + lambda:");
        list.forEach(System.out::println);
    }
}
