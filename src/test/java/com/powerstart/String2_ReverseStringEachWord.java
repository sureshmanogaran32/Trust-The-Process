package com.powerstart;

import java.util.Arrays;

public class String2_ReverseStringEachWord {

	public static void main(String[] args) {
		// Reverse String Each Word Using Split , for Each loop
		String s = "Java Is Easy";
		String[] split = s.split(" ");
		System.out.println("Before Reverse String : "+Arrays.toString(split));
		for(String word:split) {
			String rev = "";
			for(int i=word.length()-1; i>=0; i--) {
				rev = rev+word.charAt(i);
			}
			System.out.print(rev+" "); // print final result
		}
	}
}
