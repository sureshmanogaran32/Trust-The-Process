package com.powerstart;

public class Day1_SwapTwoNumbers {
	public static void swapNumber(int a, int b) {
		System.out.println("Before swap: a = " + a + ", b = " + b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After  swap: a = " + a + ", b = " + b);
	}
	public static void swapNumber1(int a, int b) {
		System.out.println("Before swap: a = " + a + ", b = " + b);
		a=a+b; //2+1=3
		b=a-b; //3-2=1
		a=a-b; //3-1=2
		System.out.println("After  swap: a = " + a + ", b = " + b);
	}
	public static void main(String[] args) {
		swapNumber(1,2);
		swapNumber1(1, 2);
	}
}
