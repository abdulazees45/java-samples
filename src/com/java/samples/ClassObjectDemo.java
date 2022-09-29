package com.java.samples;

import java.util.Scanner;

class Addition {
	int x, y;

	public int add(int x, int y) {
		this.x = x;
		this.y = y;
		return x + y;
	}
}



/*
 * access specifier return-type method-name(args,args...args){
 * 
 * method body
 * 
 * }
 * 
 */

public class ClassObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.println("Enter value for x ,y");
		x = s.nextInt();
		y = s.nextInt();
		Addition a = new Addition();
		int c = a.add(x, y);
		System.out.println("Addtion=" + c);

	

	}

}
