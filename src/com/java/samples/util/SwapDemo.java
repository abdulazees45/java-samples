package com.java.samples.util;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y = 30;
		System.out.println("before swap x="+x+":y="+y);
		swap(x,y);//method declaration
		
		System.out.println("after swap x="+x+":y="+y);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value for x & y");
		x=input.nextInt();
		y=input.nextInt();
		//swap(x,y);
		x=x+y;// 50
		y=x-y;//50-30=20
		x=x-y;//50 - 20=30
		System.out.println("after swap x="+x+":y="+y);
		
	}

	private static void swap(int x, int y) {//method definition
		// TODO Auto-generated method stub
		int temp=x;
		x=y;
		y=temp;
	
	}

}
