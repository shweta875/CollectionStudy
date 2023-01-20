package com.treemap;

import java.util.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(104, "Rahul");
		map.put(103, "Ramesh");
		
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println("HeadMap : "+map.headMap(101));
		
		System.out.println("TailSet : "+map.tailMap(101));
		
		System.out.println("Submap : "+map.subMap(101, 103));

	}

}
