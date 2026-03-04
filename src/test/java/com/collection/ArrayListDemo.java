package com.collection;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Declaration 
        /*
        ArrayList mylist1 = new ArrayList();
        List mylist2= new ArrayList();
        ArrayList<Integer> mylist3 = new ArrayList<>();
        */
        ArrayList < Object > mylist = new ArrayList < Object > ();

        //Adding data into the list
        mylist.add("Empid");
        mylist.add(100);
        mylist.add("name");
        mylist.add(100.50);
        mylist.add(true);
        mylist.add(null);
        mylist.add(null);
        mylist.add(100);
        mylist.add(true);
        // Printing
        System.out.println(mylist); //[Empid, 123, name, 100.5, true]

        //Size of list
        System.out.println("Size of the list :" + mylist.size()); //Size of the list :7

        //Remove from array list
        mylist.remove(5); // 5 is the index of array list
        System.out.println("After Remove List: " + mylist); // [Empid, 100, name, 100.5, true, null, 100, true]

        //Insert Value
        mylist.add(2, "Java");
        System.out.println("After insert : " + mylist); //[Empid, 100, Java, name, 100.5, true, null, 100, true]

        //Modify / replace/change the vlaue
        System.out.println("update value by set keyword: " + mylist.set(2, "Python"));
        System.out.println("After Modify : " + mylist); //  [Empid, 100, Python, name, 100.5, true, null, 100, true]

        //get the list value using index 
        System.out.println("Get value by index no : " + mylist.get(3)); //Get value by index no : name


        //Reading Element from the ArrayList
        /*
        //1 . Reading Element using normal for loop
        for(int i=0; i<=mylist.size()-1; i++) {
        	System.out.println("Reading Element using for loop : "+mylist.get(i));
        }
        */
        /*
        // 2 .Read all the element using  for.. each..loop
        for(Object x:mylist) {
        	System.out.println("Reading Element using for each loop "+x);
        }
        */
        // 2 . using iterate 
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        mylist.clear();
        System.out.println(mylist); //[]

    }

}