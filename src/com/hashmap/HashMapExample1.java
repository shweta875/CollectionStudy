package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1, "mango");
        map.put(2, "apple");
        map.put(3, "banana");
        map.put(4, "Grapes");
        
      for(Map.Entry e:map.entrySet()) {
    	  System.out.println("key  :"+" "+e.getKey()+" "+"value"+" "+e.getValue());
      }
     System.out.println( map.putIfAbsent(4, "shweta"));
    
       System.out.println(map);
        

	}

}
