package com.java.samples.arithmetic;

import java.util.Scanner;

public class AdditonDemo {
	static int a, b;// instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;// local variable

		Scanner input = new Scanner(System.in);// class objectname=keyword parametic constructor
		System.out.println("Enter value for x & y");// printing the value
		x = input.nextInt();// variable =object.method()
		y = input.nextInt();
		int z = x + y;
		String output = "addition=" + z;
		System.out.println(output);
	}

}