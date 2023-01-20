package com.TreeSet;

import java.util.TreeSet;

public class TreeSetBook {

	public static void main(String[] args) {
		TreeSet<Book> t=new TreeSet<Book>();
		t.add(new Book(11, "marathi"));
		t.add(new Book(15, "english"));
		t.add(new Book(2, "maths"));
		
		for(Book x:t) {
			System.out.println("id"+x.id+"name"+x.name);
		}
		

	}

}
