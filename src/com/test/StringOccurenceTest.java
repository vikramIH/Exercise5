package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.main.StringOccurence;

class StringOccurenceTest {

	StringOccurence strOccur = new StringOccurence();
	
	@Test
	void test() {
		
		String[] strArray = { "a", "b", "c", "d", "a", "c", "c" };
		Map<String, Boolean> myMap = strOccur.wordCount( strArray );
		Map<String, Boolean> actualMap = new HashMap<String, Boolean>();
		actualMap.put("a", true);
		actualMap.put("b", false);
		actualMap.put("c", true);
		actualMap.put("d", false);
		assertEquals(actualMap,myMap);
		
	}

}
