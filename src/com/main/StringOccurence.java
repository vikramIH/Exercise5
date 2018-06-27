package com.main;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

	public Map<String, Boolean> wordCount( String[] strings ) {
		
		  Map<String, Integer> map = new HashMap<String, Integer> ();
		  
		  for (String s:strings) {
		    
		    if (!map.containsKey(s)) { 
		      map.put(s, 1);
		    }
		    else {
		      int count = map.get(s);
		      map.put(s, count + 1);
		    }
		  }
		  
		  Map<String, Boolean> boolMap = new HashMap<String, Boolean> ();
		
			 for(String k : map.keySet()) {
		           Integer value = map.get(k);
		           if(value >= 2) {
		               boolMap.put(k, true);
		           }
		           else {
		               boolMap.put(k , false);
		           }
		       }
			  
			  
		  return boolMap;
		}

	
}
