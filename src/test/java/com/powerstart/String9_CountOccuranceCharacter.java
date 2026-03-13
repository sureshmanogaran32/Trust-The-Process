package com.powerstart;

public class String9_CountOccuranceCharacter {

	public static void main(String[] args) {
		// Count occurance of character in the given string
		
		String s = "count occurance of character in the given stringzzzzz";
		int count = 0;
		char ch = 'z';
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
