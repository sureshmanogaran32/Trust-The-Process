package com.powerstart;

public class String4_CountWords {
	public static void main(String[] args) {
		String s = "Java is easy suresh";
		String[] split = s.split(" ");
		int count =0;
		for(String words:split) {
			count++;
		}
		System.out.println(count);
	}
}
