package com.java.samples.util;

import java.util.Scanner;

public class AmstrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amstrong value for n");
		n = input.nextInt();
		int d1, d2, d3;
		int sum;
		d1 = n % 10;// 3
		d2 = (n / 10) % 10;// 5
		d3 = n / 100;// 1
		sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

		if (sum == n) {
			System.out.println("The given number is amstrong");

		} else {
			System.out.println("The given number is not amstrong");
		}

	}

}
