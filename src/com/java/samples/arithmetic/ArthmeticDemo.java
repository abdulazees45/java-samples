package com.java.samples.arithmetic;


import java.util.Scanner;

public class ArthmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for x , y");
		x=input.nextInt();
		y=input.nextInt();
		ArithmeticOperations ao= new ArithmeticOperations();
		ao.x=10;
		ao.y=20;
		int z=ao.add(x, y);
		System.out.println("Addition="+z);
		z=ao.mul(x, y);
		System.out.println("multiplication="+z);
		z=ao.sub(x, y);
		System.out.println("sub"+z);
		z=ao.div(x, y);
		System.out.println("Division="+z);
		
		
		
	}

}
