package com.powerstart;

public class String10_FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		// Write a Program to find and print first character that does not repeat in the given string
		
		String str ="swiwiss";
		boolean found = false;
		for(int i=0; i<=str.length()-1; i++) {
			int count = 0;
			char ch = str.charAt(i);
			
			for(int j=0; j<=str.length()-1; j++) {
				if(str.charAt(j) == ch) {
					count ++;
				}
			}
			if(count == 1) {
				found = true;
				 System.out.println("First non-repeated character: " + ch);
			}
		}
		
		if(found!=true) {
			System.out.println("No non-repeated character");
		}
	}
}
