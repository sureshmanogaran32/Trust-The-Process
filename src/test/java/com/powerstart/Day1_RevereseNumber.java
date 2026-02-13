package com.powerstart;

public class Day1_RevereseNumber {
	public static int reverse(int number) {
		int reverse= 0;
		while(number != 0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		int input = 1234;
		System.out.println("Before Reverse Number :"+input);
		int reverse = reverse(input);
		System.out.println("After Reverse Number :"+reverse);
		if(input == reverse){
			System.out.println("This is Plaindrom");
		}else {
			System.out.println("This is not a Palindrom");
		}
	}

}
