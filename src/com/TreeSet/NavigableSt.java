package com.TreeSet;

import java.util.TreeSet;

public class NavigableSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> t=new TreeSet<String>();
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("E");
		t.add("F");
		System.out.println("initial set"+t);
		
		System.out.println("reverse set"+t.descendingSet());
		
		System.out.println("head set"+t.headSet("C", true));
		
		System.out.println("sub set"+t.subSet("C", true, "E", true));
		
		System.out.println("tail set"+t.tailSet("C", false));
		

	}

}
