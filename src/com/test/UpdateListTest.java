package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.main.UpdateList;

class UpdateListTest {

	UpdateList list = new UpdateList();
	
	@Test
	void updateTest() {
		
		String strArray[] = { "Apple", "Grape", "Melon", "Berry" };
		ArrayList<String> myList = list.updateArrayItems(strArray,"Kiwi",0);
		ArrayList<String> updatedList = new ArrayList<String>( Arrays.asList("Kiwi","Grape","Melon","Berry"));
		assertEquals(updatedList, myList);
		
		String strArray2[] = { "Kiwi", "Grape", "Melon", "Berry" };
	    myList = list.updateArrayItems(strArray2,"Mango",2);
		ArrayList<String> updatedList2 = new ArrayList<String>( Arrays.asList("Kiwi","Grape","Mango","Berry"));
		assertEquals(updatedList2, myList);
		
	}
	
	@Test
	void listEmptyTest() {
		ArrayList<String> updatedList2 = new ArrayList<String>( Arrays.asList("Kiwi","Grape","Mango","Berry"));
		ArrayList<String> myList = list.emptyList( updatedList2 );
		ArrayList<String> emptyList = new ArrayList<String>();
		assertEquals(emptyList, myList);
	}
	

}
