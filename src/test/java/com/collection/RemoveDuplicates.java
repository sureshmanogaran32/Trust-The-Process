package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(500);
		mylist.add(300);
		mylist.add(100);
		mylist.add(500);
		mylist.add(400);
		System.out.println("Before Remove Duplicate :" +mylist);
		HashSet<Integer> myset = new HashSet<Integer>(mylist);
		System.out.println("After Remove Duplicate :" +myset);
	}

}
