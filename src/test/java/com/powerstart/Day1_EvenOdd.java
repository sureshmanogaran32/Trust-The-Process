package com.powerstart;

public class Day1_EvenOdd {
	public static void numberStatus(int number) {
		if(number%2==0) {
			System.out.println("Given Number is "+number+" : Even");
		}else
		{
			System.out.println("Given Number is "+number+" : Odd");
		}

	}
	public static void main(String args[]) {
		int inputValue =5;
		numberStatus(inputValue);
	}
}
