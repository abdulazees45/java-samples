package com.java.samples.arithmetic;

import java.util.Scanner;

public class MultipicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the value a & b");
		a=input.nextInt();
		b=input.nextInt();
		Multipication mul= new Multipication();
	    int c=mul.mul(a, b);
		System.out.println("multipication="+c);
	}

}
