package com.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(104, "Rahul");
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println("descending map :  "+map.descendingMap());
		
		System.out.println("headMap : "+map.headMap(101, true));
		
		System.out.println("tailMap : "+map.tailMap(101, true));
		
		System.out.println("SubMap : "+map.subMap(101, true, 102, true));
		
		
		

	}

}
