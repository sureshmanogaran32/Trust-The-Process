package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration of HashMap
		/*
		HashMap hashmap = new HashMap();
		Map map = new HashMap();
		*/
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		
		//Adding Pairs
		hm.put(101, "David");
		hm.put(102, "John");
		hm.put(103, "Mary");
		hm.put(104, "David");
		hm.put(101, "Ken");
		hm.put(null, null);
		hm.put(null, "dupl");
		
		   // Printing
		System.out.println(hm);  	//{null=dupl, 101=Ken, 102=John, 103=Mary, 104=David}
		
		//Remove one pair
		hm.remove(103); // 103 is key of the pair  
		System.out.println("After removing pair "+hm);  //{null=dupl, 101=Ken, 102=John, 104=David}
		
		//Access the pair
		System.out.println(hm.get(102)); //John
		
		//1. get all the keys from hashmap  2. get all the values from hashmap  3.get both and keys
		System.out.println("Print all the Keys "+hm.keySet()); 	//[null, 101, 102, 104]
		System.out.println("Print all the values "+hm.values()); //[dupl, Ken, John, David]
		System.out.println("Print both Keys & Values :"+hm.entrySet());  //[null=dupl, 101=Ken, 102=John, 104=David]

		//Reading data from Hashmap
		// Normal for loop not support because it stores in random order
		//Read all the element using  for.. each..loop
		/*
		for(int  k:hm.keySet()) {
			System.out.println(k   +"     "+hm.get(k));
		}
		*/
		//Read all the element using iterator
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
		//	System.out.println(it.next());  //(OR)
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()  +"     "+entry.getValue());
		}

	}

}
