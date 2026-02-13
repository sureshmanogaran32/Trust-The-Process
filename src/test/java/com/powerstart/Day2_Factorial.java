package com.powerstart;

public class Day2_Factorial {
	public static int factorial(int n) {
		int result=1;
		if(n<0) {
			 throw new IllegalArgumentException("Factorial not defined for negative numbers");
		}
		for(int i=n; i>=1; i--) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		// 5!  5*4*3*2*1
		int number =0;
		int result = factorial(number);
		System.out.println(result);
	}
}
