package com.main;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberofCounts {

	public HashMap<String, Integer> countNumbers ( String str ) {
		
		int[] count = new int[3];
		String number = "one";
		
		for ( int i = 0; i < 3; i++ ) {
			
	     Pattern p = Pattern.compile(number);
		 Matcher m = p.matcher(str);
		
	    	while ( m.find() ) {
	     		count[i]++; 
		    }
	    	
	    	if ( number == "one")  number = "two";
	    	else number = "three";
		}
		
	    	HashMap<String, Integer> map = new HashMap<>();
	    	  map.put("one", count[0]);
	          map.put("two", count[1]);
	          map.put("three", count[2]);
	    	
	          return map;
		}	
		
	  
	
}
