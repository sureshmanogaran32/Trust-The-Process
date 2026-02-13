package com.powerstart;

public class Day1_CountOddEvenNumber {
    public static void main(String[] args) {
		int number = 123465;
		int countOdd=0;
		int countEven=0;
		while (number != 0) {
			int lastDigit=number%10;
			number = number/10;
			if(lastDigit%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
		}	
		System.out.println("Even numbers : "+countEven);
		System.out.println("Odd numbers : "+countOdd);
	}
}