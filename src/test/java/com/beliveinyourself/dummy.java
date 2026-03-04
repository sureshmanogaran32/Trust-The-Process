package com.beliveinyourself;

public class dummy {
	public static void main (String[] args){ 
		String s = "The programming world";
		String text = s.toLowerCase();
		int countVowles = 0;
		int countCons =0;
		for(int i=0; i<=text.length()-1;i++) {
			char ch = text.charAt(i);
			if(ch== 'a' ||ch== 'e' ||ch== 'i' ||ch== 'o' ||ch== 'u') {
				countVowles ++;
			}else if(ch!=' '){
				countCons++;
			}
		}
		System.out.println("Count of vowles :" +countVowles);
		System.out.println("Count of Consonants :" +countCons);
	}
}  
