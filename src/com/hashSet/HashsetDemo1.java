package com.hashSet;

import java.util.HashSet;
import java.util.Iterator;



public class HashsetDemo1 {
	public static void main(String[] args) {
		
	HashSet<Integer> hs=new HashSet<Integer>();
 hs.add(2);
 hs.add(5);
 hs.add(55);
hs.add(78);
 hs.add(6);
 hs.add(8);
 hs.add(27);
 
 HashSet<Integer> hs1=new HashSet<Integer>();
 // boolean b=hs.remove(78);
 // System.out.println(b);
 hs1.add(5);
 hs1.add(55);
 hs.removeAll(hs1);
 
 Iterator i=hs.iterator();
 while(i.hasNext()) {
	 System.out.println(i.next());
 }
}
}