package com.powerstart;

import java.util.Arrays;

public class String11_StringAnagram {

	public static void main(String[] args) {
		// Check Two Strings Are Anagram
		String str1 = "listen";
        String str2 = "silent";

        // convert to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort arrays
        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);
        System.out.println(arr2);

        // compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }

	}

}
