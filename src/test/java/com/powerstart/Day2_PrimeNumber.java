package com.powerstart;

public class Day2_PrimeNumber {
	//Number should be > 1
	//number should be divisible by 1 and by same number
	//19 -> divisible by 1 and 19
	//20 -> divisible by 1, 20, 2, 4, 5
	public static int  primeNo(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int input =6;
		int result = primeNo(input);
		if(result==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
