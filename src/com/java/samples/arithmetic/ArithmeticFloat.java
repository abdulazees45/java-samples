package com.java.samples.arithmetic;

import java.util.Scanner;

import com.java.samples.Arithmetic;

public class ArithmeticFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a1, b1;

		Scanner inputFloat = new Scanner(System.in);
		System.out.println("Enter the float value for a1 & b1");
		a1 = inputFloat.nextFloat();
		b1 = inputFloat.nextFloat();//convert from string to float

		Arithmetic a = new Arithmetic();
		float c1 = a.add(a1, b1);
		System.out.println("Addition=" + c1);
		c1 = a.mul(a1, b1);
		System.out.println("multipication=" + c1);
		c1 = a.sub(a1, b1);
		System.out.println("subtraction=" + c1);
		c1 = a.div(a1, b1);
		System.out.println("division=" + c1);
	}

}
