package com.java.samples.relational;

import java.util.Scanner;

public class RelationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a , b;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the value of a , b");
		a=input.nextInt();
		b=input.nextInt();
		RelationalOperator ro = new RelationalOperater();
		boolean c = ro.equalto(a , b);
		System.out.println("equalto="+c);
		c =ro.greater(a , b);
		System.out.println("greater="+c);
		c =ro.less(a, b);
		System.out.println("less="+c);
		
	}

}
