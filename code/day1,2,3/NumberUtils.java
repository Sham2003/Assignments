package com.training.first;

import java.util.function.UnaryOperator;

public class NumberUtils {
	public static double LogFinder(double v) {
		return Math.log(v);
	}
	
	public static boolean isEven(int n) {
		return n%2 == 0;
	}
	
	
	public static void main(String[] args) {
		UnaryOperator<Double> LogFinder = NumberUtils::LogFinder;
		System.out.println(LogFinder.apply(214.4214));
	}
}
