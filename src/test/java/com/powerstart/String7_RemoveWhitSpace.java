package com.powerstart;

public class String7_RemoveWhitSpace {
	public static void main(String[] args) {
		// Quick one-linerreplace(" ", "")
		// Remove all whitespacereplaceAll("\\s+", "")
		String s = "  This is java program   ";
		String result ="";
		System.out.println("Before Remove White Space : "+s);
		
		// By using replace
		String replace = s.replace(" ", "");
		System.out.println("After Remove White Space : "+replace);
		
		
		// removes spaces, tabs, newlines too by using  replaceAll
		String replaceAll = s.replaceAll("\\s", "");
		System.out.println("After Remove White Space : "+replaceAll);
		
		// Removes spaces by using for loop and if condition 
		for(int i =0; i<=s.length()-1; i++) {
			if(s.charAt(i) != ' ') {
				result = result + s.charAt(i) ;
			}
		}
		System.out.println("After Remove White Space : "+result);
	}
}
