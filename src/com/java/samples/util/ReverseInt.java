package com.java.samples.util;

public class ReverseInt {

	public int rev(int x) {
		int d;
		int rev = 0;
		while (x != 0) {
			d = x % 10;// 123 reminder 3
			rev = rev * 10 + d;
			x = x / 10;
		}

		return rev;
	}

}
