package com.java.samples;

import java.util.Scanner;

public class Samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java");
		int a,b;
		System.out.println("add the two numbers:");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		int c;
		c=a+b;
		System.out.println("Addition="+c);
	
			
		
		System.out.println("Enter any number to find odd or even");
		Scanner inputsc=new Scanner(System.in);
		int a1=inputsc.nextInt();
		if (a1%2==0) {
			System.out.println("The given number is even");
			
		}
		
		else {
			System.out.println("The given number is odd");
			
		
		}
		
	}

}
