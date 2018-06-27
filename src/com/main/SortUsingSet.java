package com.main;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortUsingSet {

	public ArrayList<String> sortStrings ( String[] str ) {
		
		SortedSet<String> Names = new TreeSet<String>();
		
		for ( String s : str ) {
			Names.add(s);
		}
		
		ArrayList<String> arrayList = new ArrayList<String>(Names);
		return arrayList;
		
	}
	
}
