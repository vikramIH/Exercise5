package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.main.SortUsingSet;

class SortUsingSetTest {

	SortUsingSet sortSet = new SortUsingSet();
	
	@Test
	void test() {
		
		String[] strArray = { "Harry", "Olive", "Alice", "Bluto" , "Eugene" };
		ArrayList<String> myList = sortSet.sortStrings( strArray ); 
ArrayList<String> actualList = new ArrayList<String>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"));
		assertEquals(actualList,myList);
		
	}

}
