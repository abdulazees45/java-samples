package com.java.samples;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {23,6,45,34,24};

		System.out.println("Num="+num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int a=0;
		while(a<num.length) {
			System.out.print(num[a]+" ");
			a++;
		}
		//findDigit(2384);
		int[] nums= {12,34,56,45,65,51,53,37,434,566,34};
		for(int x=0;x<nums.length;x++) {
			
			findDigit(nums[x]);
			findEven(nums[x]);
			
		}
		//System.out.println("Sum="+sum);
		/*
		 * int[] b=new int[10]; Scanner input=new Scanner(System.in);
		 * System.out.println("Enter values for array"); for(int i=0;i<b.length;i++) {
		 * b[i]=input.nextInt(); } for(int j=0;j<b.length;j++) {
		 * System.out.print(b[j]+" "); }
		 */
		
	}

	

	private static void findEven(int i) {
		// TODO Auto-generated method stub
		if (i%2==0) {			
			System.out.print(i+" "); 
			}
	}

	private static void findDigit(int i) {
		// TODO Auto-generated method stub
		
		int x=0;
		
		while(i!=0) {
			if(i%10!=0) {
				x++;
			}
			i=i/10;
		}
		System.out.println("No of digits:"+x);
		
	}
	
	

}
