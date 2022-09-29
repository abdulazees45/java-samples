package com.java.samples.arithmetic;

import java.util.Scanner;

public class SubtractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int x,y;
		Scanner input = new Scanner (System.in);
		System.out.println("enter the value x & y");
		x=input.nextInt();
		y=input.nextInt();
		Subtraction sub= new Subtraction();
		int z= sub.sub(x,y);
		System.out.println("subtraction="+z);
		
		
	}

}
