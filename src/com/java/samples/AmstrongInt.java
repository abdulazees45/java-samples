package com.java.samples;

public class AmstrongInt {
		int x;
	public int ams(int a) {
		int d1, d2, d3;
		int sum;
		d1 = a % 10;// 3
		d2 = (a / 10) % 10;// 5
		d3 = a/ 100;// 1
		sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
	
		
		return sum;
	}
}

