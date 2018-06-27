package com.main;

import java.util.ArrayList;
import java.util.Arrays;


public class UpdateList {

	public ArrayList<String> updateArrayItems ( String[] strArray, String str, int pos ) {
		
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArray)); 	
		list.set(pos, str);
		
		return list;
	}
	
	public ArrayList<String> emptyList ( ArrayList<String> list ) {
		
		list.clear();
		return list;
	}
	
}
