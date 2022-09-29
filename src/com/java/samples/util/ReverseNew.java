package com.java.samples.util;

import java.util.Scanner;

public class ReverseNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int d;
		int rev = 0;
		Scanner inputrev = new Scanner(System.in);
		System.out.println("Enter the reverse value for:");
		x = inputrev.nextInt();

		ReverseInt r = new ReverseInt();
		x = r.rev(x);
		System.out.println("Reverse=" + x);

	}

}
