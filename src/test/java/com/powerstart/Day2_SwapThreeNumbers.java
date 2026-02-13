package com.powerstart;

public class Day2_SwapThreeNumbers {
	public static int swapThreeNumbers(int a, int b, int c) {
		System.out.println("Before Swapping A:"+a+" B:"+b+" C:"+c);
		a= a+(b+c);
		b= a-(b+c);
		c= a-(b+c);
		a=a-(b+c);
		System.out.println("After Swapping A:"+a+" B:"+b+" C:"+c);
		return c;
	}
	public static void main(String[] args) {
		swapThreeNumbers(1, 2, 3);
	}

}
