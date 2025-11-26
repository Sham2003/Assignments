package com.training.day4;

import java.util.Arrays;

class ArrayPrinter<T> {
	private T[] arr;

	public ArrayPrinter(T[] is) {
		arr = is;
	}


	@Override
	public String toString() {
		return "ArrayPrinter [arr=" + Arrays.toString(arr) + "]";
	}
	
	
	public void print() {
		System.out.print("[");
		for(T i: arr) {
			System.out.print("{" + i + "},");
		}
		System.out.println("]");
	}
	
}

public class GenericDemo3 {
	public static void main(String[] args) {
		Integer[] arr = {1,2,4,5,6};
		ArrayPrinter<Integer> nums = new ArrayPrinter<>(arr);
		nums.print();
	}
}
