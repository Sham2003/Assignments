package com.training.day6;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        // 1. Creating Streams
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");


        Stream<String> streamFromList = names.stream();

        String[] arr = {"Java", "Python", "C++", "Go"};
        Stream<String> streamFromArray = Arrays.stream(arr);


        Stream<Integer> streamOf = Stream.of(1, 2, 3, 4, 5);


        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered (starts with A): " + filtered);


        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);


        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);


        Integer arr1[] = {1,5,23,6,2,62,62,3,13,61,6,13,61,3,16,316,363,61,36,1,361,36,13,61,36,36,4,7,2,24,24,72,4,513,51,35,15,13,51,};
        Arrays.stream(arr1).filter(n -> n%3 == 0).distinct().skip(2).forEach(System.out::println);
        
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);

        // Limit & Skip
        List<String> limited = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited (first 3): " + limited);

        List<String> skipped = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped (first 2): " + skipped);


        System.out.print("Names in uppercase: ");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();


        int sum = streamOf.reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum);

  
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + joined);
  
        long count = names.stream().count();
 
        Optional<String> shortestName = names.stream()
                .min(Comparator.comparingInt(String::length));
        shortestName.ifPresent(s -> System.out.println("Shortest name: " + s));

        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        longestName.ifPresent(s -> System.out.println("Longest name: " + s));

        IntStream intStream = IntStream.range(1, 6); // 1 to 5
        int sumRange = intStream.sum();
        System.out.println("Sum of range 1-5: " + sumRange);

        DoubleStream doubleStream = DoubleStream.of(2.5, 3.5, 4.5);
        double avg = doubleStream.average().orElse(0.0);
        System.out.println("Average: " + avg);

        List<Integer> bigList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        int parallelSum = bigList.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel sum: " + parallelSum);

        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println("Name length map: " + nameLengthMap);
    }
}
