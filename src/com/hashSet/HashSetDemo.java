package com.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(6);
		a.add(8);
		a.add(1);
	
		
		HashSet<Integer> hs=new HashSet<Integer>(a);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()); 
			
		}

	}

}
