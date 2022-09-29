package com.java.samples.arithmetic;

import java.util.Scanner;

public class ArithmeticNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the value a & b");
		a=input.nextInt();
		b=input.nextInt();
		ArithmeticOperation aop= new ArithmeticOperation();
		int c=aop.add(a,b);
		System.out.println("Addition="+c);
		c=aop.sub(a,b);
		System.out.println("subtraction="+c);
		c=aop.mul(a,b);
		System.out.println("multipication="+c);
		c=aop.div(a,b);
		System.out.println("division="+c);
	}

}
