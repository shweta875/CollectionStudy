package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Mango");
		m.put(2, "Apple");
		m.put(3, "Banana");
		m.put(5, "Garpes");
		m.put(5, "Banana");
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		for(Map.Entry e:m.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		

	}

}
