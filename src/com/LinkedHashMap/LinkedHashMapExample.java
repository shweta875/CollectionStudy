package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		
		
	
		
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(1, "shweta");
		m.put(3, "Yuvraj");
		m.put(5, "Swaraj");
		m.put(0, "Swaraj");
		
		for(Map.Entry k :m.entrySet()) {
			System.out.println(k.getKey()+"  "+k.getValue());
			
		}
		for(int ks:m.keySet()) {
			String name=m.get(ks);
			System.out.println(ks+" "+name);
			
		}

	}

}
