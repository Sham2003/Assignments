
package com.training.first;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class DemoOnSupplier {

	private static Predicate<String> checkStart(String... c) {
		return (n) -> {
			boolean res = true;
			for(int i=0; i< c.length; i++) 
				res = res & n.startsWith(c[i]);
			return res;
		};
	}
	
    public static void main(String[] args) {
        Random r = new Random();

        // Simple Supplier
        Supplier<String> justSupplier = () -> "SHAM";
        System.out.println("Produced : " + justSupplier.get());

        Supplier<String> randomName = () -> {
            int length = r.nextInt(20) + 3; 
            StringBuilder sb = new StringBuilder();
            sb.append((char) ('A' + r.nextInt(26)));
            for (int i = 1; i < length; i++) {
                sb.append((char) ('a' + r.nextInt(26))); 
            }
            return sb.toString();
        };

        Consumer<String> printName = name -> System.out.println("Generated Name: " + name);

        // Predicate examples
        
        Predicate<String> startsWithA = checkStart("A", "B","S","T","Q");
        Predicate<String> lengthGreaterThan5 = name -> name.length() > 5;
        
        System.out.println("\n--- Names Generated and Filtered ---");
        for (int i = 0; i < 10; i++) {
            String name = randomName.get();
            if (startsWithA.and(lengthGreaterThan5).test(name)) {
                printName.accept(name);
            }
        }
    }
}
