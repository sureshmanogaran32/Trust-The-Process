package com.powerstart;

public class String6_ReplaceXwithVowels {
	public static void main(String[] args) {
		String s = "Java is simple program";
		String replace = "";
		/*
		//Replace X using string method 
		for(int i =0; i<=s.length()-1; i++) {
			replace = s.replaceAll("[aeiou]", "X");
		}
		System.out.println(replace);
		*/
		//Replace X without using string method 
		for(int i =0; i<=s.length()-1; i++) {
			if(s.charAt(i) == 'a' ||
					s.charAt(i) == 'e' ||
					s.charAt(i) == 'i' ||
					s.charAt(i) == 'o' ||
					s.charAt(i) == 'u') {
				replace = replace + 'X';
			} else {
				replace = replace + s.charAt(i);
			}
		}
		System.out.println(replace);
		
	}

}
