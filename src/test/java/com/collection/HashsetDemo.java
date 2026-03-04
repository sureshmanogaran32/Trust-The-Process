package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		//Declaration 
		/*
		HashSet myset1 = new HashSet();
		Set myset2 = new HashSet();
		*/
		HashSet<Object> myset = new HashSet<Object>();
		myset.add(100);
		myset.add("Welcome");
		myset.add(10.50);
		myset.add('A');
		myset.add(true);
		myset.add("Java");
		myset.add(null);
		//Printing
		System.out.println(myset); //[null, A, Java, 100, 10.5, Welcome, true]
		//Size of Hashset
		System.out.println("Size of Hashset :"+myset.size());
		//Remove Element
		myset.remove(10.5);
		System.out.println("After removing : "+myset); //[null, A, Java, 100, Welcome, true]
		//Inserting Element is not possible because indexing order is random hashset
		//Access specific element is not possible because indexing order is random hashset
		
		//Converting HashSet into ArrayList & Array List into HashSet
		ArrayList<Object> arraylist = new ArrayList<Object>(myset);
		System.out.println(arraylist);  //[null, A, Java, 100, Welcome, true]
		arraylist.set(1, 'B');
		System.out.println(arraylist); //[null, B, Java, 100, Welcome, true]
		HashSet<Object> myset1 = new HashSet<Object>(arraylist);
		System.out.println(myset1); //[null, Java, B, 100, Welcome, true]
		
		//Read all the element using normal for loop is not possible because we dont have method to get the value
		
		//Read all the element using  for.. each..loop
		for(Object x:myset) {
			System.out.print(x +" ,"); // null ,A ,Java ,100 ,Welcome ,true ,
		}
		
		//Read all the element using iterator
			Iterator it = myset.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			//Clear
			myset.clear();
			System.out.println("After clear : "+myset);  //[]
	}

}
