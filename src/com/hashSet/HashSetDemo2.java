package com.hashSet;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Books> hs=new HashSet<Books>();
		hs.add(new Books("maths", 1));
		hs.add(new Books("marathi", 12));
		hs.add(new Books("english", 6));
		Iterator<Books> i =hs.iterator();
         while(i.hasNext()) {
        	 System.out.println(i.next());
         }
         
         for(Books x:hs) {
        	 System.out.println(x.id+" "+x.name);
         }
	}

}
