package com.powerstart;

import java.util.HashSet;

public class String8_DuplicateCharacter {

	public static void main(String[] args) {
		String s = "programmingr";
		
		HashSet<Character> line = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();
		HashSet<Character> line1 = new HashSet<Character>();
		HashSet<Character> duplicate1 = new HashSet<Character>();
		
		 
		// Method 1 using HashSet
		for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	    if(line.add(c)) {
	    	line.add(c);
	    }else {
	    	duplicate.add(c);
	    	}
		}
	        System.out.println("Set without duplicate "+line);
		    System.out.println("Dupliate Characters : "+ duplicate);
		    
		    //Mehod 2 optimizing above if condition
	    System.out.println("*******************************");
		    for (int i = 0; i < s.length(); i++) {
		    	char c = s.charAt(i);
		    	if( ! line1.add(c) && duplicate1.add(c)){
		    		 System.out.println("Duplicate Character : " + c);
		    	}
		    }
		    
		    // Method 3 using indexOf() and lastIndexOf()
		    System.out.println("*******************************");
		    for(int i=0; i<= s.length()-1; i++) {
		    	char ch = s.charAt(i);
		    	if (s.indexOf(ch) != s.lastIndexOf(ch)) {
		            System.out.println(ch + " is duplicate");
		        }
		    }
	// Method 4 using 2 for loop
		    System.out.println("*******************************");
		    for(int i=0; i<=s.length()-1; i++) {
		    	for(int j=i+1; j<=s.length()-1; j++) {
		    		if(s.charAt(i) == s.charAt(j)) {
		    			System.out.println("Duplicate Character : "+s.charAt(i));
		 
		    		}
		    	}
		    }
	        
	}

}
