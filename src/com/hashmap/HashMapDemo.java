package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "shweta");
		hm.put(2, "yuvraj");
		hm.put(5, "Swaraj");
		hm.put(8, "vrunda");
		for(Map.Entry x:hm.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
		}
		System.out.println(hm.replace(1, "tina"));
		System.out.println(hm);
	}

}
