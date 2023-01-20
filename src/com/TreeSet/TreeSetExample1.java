package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Ravi");
		t.add("Vijay");
		t.add("Ravi");
		t.add("Ajay");
		//System.out.println(t);
        Iterator  itr=t.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
       Iterator<String> it=t.descendingIterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       
	}

}
