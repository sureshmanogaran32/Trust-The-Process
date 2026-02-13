package com.powerstart;

public class Day2_ArmstrongNumber {
	public static int armsstrongNo(int n) {
		int result =0; int sum =0;
		while(n!=0) {
			int lastDigit=n%10;
			sum = lastDigit * lastDigit * lastDigit;
			result = result + sum;
			//sum = sum + (lastDigit *lastDigit * lastDigit * lastDigit);
			n=n/10;
			
		}
		return result;
	}

	public static void main(String[] args) {
		int input =154;
		int result = armsstrongNo(input);
		if(result == input) {
			System.out.println(input+" Input is Armstrong Number");
		} else {
			System.out.println(input+" Input is Not Armstrong Number");
		}
	}
}
