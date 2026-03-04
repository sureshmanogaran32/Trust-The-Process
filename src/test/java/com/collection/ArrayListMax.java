package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMax {

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(500);
		mylist.add(300);
		mylist.add(100);
		mylist.add(400);
		// Find maximum using predefined methods
		Integer max = Collections.max(mylist);
		System.out.println("Maximum Number in the list :"+max);
		Integer min = Collections.min(mylist);
		System.out.println("Minimum Number in the list :"+min);
		
		
		// Find maximum using another way of method
		int maxValue = mylist.get(0);
		for(int i=0; i<=mylist.size()-1; i++) {
			if(maxValue <= mylist.get(i)) {
				maxValue = mylist.get(i);
			}
		}
		System.out.println("Max Value: "+maxValue);
		
		// Find min value using another way of method
		int minValue = mylist.get(0);
		for(int i=0; i<=mylist.size()-1; i++) {
			if(minValue >= mylist.get(i)) {
				minValue = mylist.get(i);
			}
		}
		System.out.println("Min Value: "+minValue);
	}
}
