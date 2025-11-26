package com.training.first;

@FunctionalInterface
interface DualOp {
    int execute(int a, int b);
}

class Calculator {
    // Using method references to static methods
    public DualOp add = Integer::sum;          // instead of (a, b) -> a + b
    public DualOp sub = Calculator::subtract;  // referencing a custom static method

    public static int subtract(int a, int b) {
        return a - b;
    }
}

interface NamePrinter {
    void printName(String n);
}

class FuoPrinter implements NamePrinter {
    public void printName(String n) {
        System.out.print(n);
    }
}

@FunctionalInterface
interface StringReverse {
    String reverse(String input);
}

@FunctionalInterface
interface FindLength {
    int[] findLength(String[] input);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) throws InterruptedException {
        FindLength lengthFinder = FunctionalInterfaceDemo::getLengths;

        String[] words = {"Sham", "S", "System", "Expression"};
        int[] result = lengthFinder.findLength(words);

        System.out.println("Original Strings:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nLengths:");
        for (int len : result) {
            System.out.println(len);
        }
        
        StringReverse reverser = FunctionalInterfaceDemo::reverseString;
        System.out.println("\nReversed: " + reverser.reverse("FunctionalInterface"));
    }

    // Helper method for FindLength
    public static int[] getLengths(String[] arr) {
        return java.util.Arrays.stream(arr)
                               .mapToInt(String::length) // method reference
                               .toArray();
    }

    // Helper method for StringReverse
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
