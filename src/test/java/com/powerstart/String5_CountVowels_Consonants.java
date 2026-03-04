package com.powerstart;

public class String5_CountVowels_Consonants {
	public static void main(String[] args) {
		String input = "This is Suresh";
		String s = input.toLowerCase();
		
		int countVowels =0;
		int countCons =0;
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)  ==  'a' || 
					s.charAt(i)  == 'e'|| 
					s.charAt(i)  == 'i'|| 
					s.charAt(i)  == 'o'|| 
					s.charAt(i)  == 'u') {
				countVowels ++;
			} else {
				if(s.charAt(i) != ' ') {
					countCons++;
				}
			}
		}
		System.out.println("Count the Vowels :"+countVowels);
		System.out.println("Count the Consonants :"+countCons);
		
	}

}
