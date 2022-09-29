package com.java.samples;

import java.util.Scanner;

public class AmstrongNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		// Scanner inputams=new Scanner(System.in);
		System.out.println("Amstrong number between 1 to 1000:");
		// a=inputams.nextInt();

		AmstrongInt ai = new AmstrongInt();

		for (int num = 1; num <= 1000; num++) {
			x = ai.ams(num);
			if (x == num) {
				System.out.println(x);

			}

		}
	}
}
