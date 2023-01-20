package com.wipro.shweta.stdy.collection.variousList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("Mango");
	a.add("Apple");
	a.add("Grapes");
	a.add("Banana");
    Collections.sort(a);
    System.out.println(a);
    Collections.reverse(a);
	System.out.println(a);

}
}
