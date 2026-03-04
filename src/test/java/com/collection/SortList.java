package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
		public static void main(String[] args) {
				
			ArrayList <Integer> mylist = new ArrayList<Integer>();
			mylist.add(100);
			mylist.add(20);
			mylist.add(15);
			mylist.add(300);
			mylist.add(5);
			System.out.println("Before Sorting : "+mylist);
			/*
			//Using Collections Utility Class
			Collections.sort(mylist);
			System.out.println("After Sorting using Collections utility class"+mylist);
			*/
			
			//Using sort method
			mylist.sort(null);
			System.out.println("After Sorting using sort method"+mylist);
			
			//Descending Order Sort
			mylist.sort(Collections.reverseOrder());
			System.out.println("After Sorting descending order "+mylist);
		}

}
