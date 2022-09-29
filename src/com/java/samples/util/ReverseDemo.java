package com.java.samples.util;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int x = 123;
		int d;
		int rev = 0;
		while(x!=0) {
			d=x%10;// store the remainder value
			rev=rev*10+d;
			x=x/10;

		}
		System.out.println("revers="+rev);
	}

}
