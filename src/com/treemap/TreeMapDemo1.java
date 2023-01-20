package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(101, "Amit");
		map.put(102, "Ravi");
		map.put(100, "Vijay");
		map.put(103, "Rahul");
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("after removing elements");
		
		map.remove(100);
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		
	}

}
]