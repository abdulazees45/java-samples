package com.java.samples.util;

public class ASCIIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char x='A';x<='Z';x++) {
			System.out.print((int)x+" ");
		}
		
		System.out.println();
		
		for(char x='a';x<='z';x++) {
			System.out.print((int)x+" ");
		}
		System.out.println();
		for(int x=1;x<=10;x++) {
			System.out.print(x+" ");
		}
		
		for (int x=1; x<=100; x++) {
			System.out.print(x+" ");
		}
	}

}