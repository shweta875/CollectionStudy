package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutAll {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Mango");
		hm.put(2, "Apple");
		hm.put(3, "Banana");
		System.out.println("After invoking Put method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		hm.putIfAbsent(0, "shweta");
		System.out.println("After putifAbsent method");
		
	for(Map.Entry me:hm.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue());
	}
	HashMap<Integer,String> hm1 =new HashMap<Integer,String>();
	hm1.put(12, "rama");
	hm.putAll(hm1);
	System.out.println("After Invoking putAll method");
		
	 for(Map.Entry me1:hm.entrySet()) {
		 System.out.println(me1.getKey()+"  "+me1.getValue());
		 
	 }
	}

}
