package com.powerstart;

public class String1_ReverseString_3Palindrom {

	public static void main(String[] args) {
		// Reverse String using CharAt
		//String s = "Priya";
		String s = "madaM";
		String rev = "";
		System.out.println("Before Reverse String : "+s);
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("After Reverse String : "+rev);
		
		// Reverse String using String Builder
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sbReverse=sb.reverse();
		System.out.println("After Reverse String Using String Builder : "+sbReverse);
		
		//Check Given String is Palindrom
	if(s.equalsIgnoreCase(rev)){
			System.out.println("Given String is Palindrom");
		}else {
			System.out.println("Given String is Not A Palindrom");
		}
	}
}
