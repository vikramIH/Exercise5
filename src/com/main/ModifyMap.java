package com.main;

import java.util.Map;

public class ModifyMap {

	public Map<String, String> changeValues ( Map<String, String> myMap ) {
		
		myMap.replace("val2", myMap.get("val1"));
		myMap.replace("val1", " ");
		return myMap;
		
	}
	
}
