package com.powerstart;

public class Number9_SumofDigits {
	public static int calculateSum(int number) {
		int sum =0;
		while(number != 0) {
			sum = sum+number%10;
			//sum+=number%10
			number=number/10;
			//number/=10;
		}
		return sum;
	}
	public static void main(String args[]) {
		int inputValue=12345;
		int result = calculateSum(inputValue);
		System.out.println("Sum of Number : "+result);
	}
}

