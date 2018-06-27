package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.main.ModifyMap;

class ModifyMapTest {

	ModifyMap modifyMap = new ModifyMap(); 
	
	@Test
	void test() {
		
		Map<String, String> inputMap = new HashMap<String, String>();
		inputMap.put("val1", "java");
		inputMap.put("val2", "c++");
		
	    inputMap = modifyMap.changeValues( inputMap );
	    
	    Map<String, String> changedMap = new HashMap<String, String>();
		changedMap.put("val1", " ");
		changedMap.put("val2", "java");
		
		assertEquals(changedMap, inputMap);
	}

}
