package com.java.samples.util;

import java.util.Scanner;

public class SwapFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x=20.3f,y=30.5f;
		double b=20.87;
		int a=10;
		x=a;//implicit type casting
		a=(int) x;//explicit type casting
		Scanner inputFloat= new Scanner(System.in);
		System.out.println("Enter the value for x & y");
		x=inputFloat.nextFloat();
		y=inputFloat.nextFloat();
		//ASCII//AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE
		swap(x,y);
		

	}

	private static void swap(float x, float y) {
		// TODO Auto-generated method stub
		
		float temp=x;
		      x=y;
		      y=temp;
		  System.out.println("x="+x+"y="+y);    
	}

}
