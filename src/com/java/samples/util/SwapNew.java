package com.java.samples.util;

import java.util.Scanner;

public class SwapNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value x & y");
		x=input.nextInt();
		y=input.nextInt();

		swap (x,y);
		
		
		

	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int temp=x;//temp=20
		    x=y;//x=30
		    y=temp;//y=20
		    System.out.println("x="+x+"y="+y);
		
	}

}
