package com.concepts;

public class ExampleStatic {
	static int result =0;
	int n = 10;
	public static int add(int a, int b) {
		System.out.println("Before Method "+result);
		result = a+b;
		System.out.println(result);
		return result;
	}
	public int mul(int a, int b) {
		System.out.println("Before Method"+result);
		result = a*b;
		System.out.println(result);
		result = n+result;
		return result;
	}
	public static void main(String[] args) {
		ExampleStatic ex = new ExampleStatic();
		int staticMethod = add(1, 2);
		System.out.println(staticMethod);
		
		int mul = ex.mul(2, 2);
		System.out.println(mul);
		System.out.println("After execution : "+result);
		
	}
	

}
