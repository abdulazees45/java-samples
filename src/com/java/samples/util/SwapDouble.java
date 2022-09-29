package com.java.samples.util;

import java.util.Scanner;

public class SwapDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the double value for a , b");
		a = inputDouble.nextDouble();
		b = inputDouble.nextDouble();

		swapDouble(a, b);
	}

	private static void swapDouble(double a, double b) {
		// TODO Auto-generated method stub
		double temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "b=" + b);
	}

}
