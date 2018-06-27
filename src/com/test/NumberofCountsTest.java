package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.main.NumberofCounts;

class NumberofCountsTest {

	NumberofCounts numCount = new NumberofCounts();
	
	
	@Test
	void test() {
		
	  HashMap<String, Integer> myMap = numCount.countNumbers("one one -one___two,,three,one @three*one?two");
	  HashMap<String, Integer> actualMap = new HashMap<>();
	  actualMap.put("one", 5);
      actualMap.put("two", 2);
      actualMap.put("three", 2);
	  assertEquals(actualMap, myMap);
		
	}

}
