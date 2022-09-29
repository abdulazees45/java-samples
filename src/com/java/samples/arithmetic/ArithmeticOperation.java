package com.java.samples.arithmetic;

public class ArithmeticOperation {

	int a , b;
	public ArithmeticOperation() {
		System.out.println("I am loading values for this class");
	}
	public int add(int a, int b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
	public int sub(int a ,int b) {
		this.a=a;
		this.b=b;
		return a-b;
		
	}
	public int mul(int a, int b) {
		this.a=a;
		this.b=b;
		return a*b;
	}
	public int div(int a, int b) {
		this.a=a;
		this.b=b;
		return a/b;
	}
}
