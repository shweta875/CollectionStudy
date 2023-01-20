package com.linkedHashSet;

import java.util.LinkedHashMap;

public class LinkedHashSetKeyValue {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
	l.put(100, "shweta");
	l.put(101, "Yuvraj");
	l.put(103, "ravi");
	//fetching key
	System.out.println(l.keySet());
	System.out.println("....................................................");
	
	//fetching value
	System.out.println(l.values());
	System.out.println("....................................................");
	
	
	//fetching key value pair
	System.out.println(l.entrySet());
	
}
}
