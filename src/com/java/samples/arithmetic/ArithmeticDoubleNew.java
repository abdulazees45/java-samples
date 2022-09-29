package com.java.samples.arithmetic;

import java.util.Scanner;

public class ArithmeticDoubleNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1, d2;
		Scanner inputdouble = new Scanner(System.in);
		System.out.println("Enter the double value for:");
		d1 = inputdouble.nextDouble();
		d2 = inputdouble.nextDouble();

		ArithmeticDouble ad = new ArithmeticDouble();
		double d3 = ad.add(d1, d2);
		System.out.println("Addition=" + d3);
		d3 = ad.sub(d1, d2);
		System.out.println("Subtraction=" + d3);
		d3 = ad.mul(d1, d2);
		System.out.println("Multipication=" + d3);
		d3 = ad.div(d1, d2);
		System.out.println("Division=" + d3);
	}

}
