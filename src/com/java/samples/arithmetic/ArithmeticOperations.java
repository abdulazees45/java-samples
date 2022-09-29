package com.java.samples.arithmetic;

public class ArithmeticOperations {
	
	int x, y;//instance variable
	static int a;//static variable /class variable

	public int add(int x, int y) {
		int z;//local variable
		this.x = x;
		this.y = y;
		return x + y;
	}
	
	public int mul(int x, int y) {
		this.x = x;
		this.y = y;
		return x * y;
	}
	
	public int sub(int x, int y) {
		this.x = x;
		this.y = y;
		return x - y;
	}
	
	public int div(int x, int y) {
		this.x = x;
		this.y = y;
		return x / y;
	}

}
