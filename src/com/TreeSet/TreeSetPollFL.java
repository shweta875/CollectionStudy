package com.TreeSet;

import java.util.TreeSet;

public class TreeSetPollFL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(21);
		t.add(2);
		t.add(4);
		t.add(5);
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
    System.out.println(t);
	}

}
