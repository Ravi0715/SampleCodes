package org.kartheek;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortMap {
	public static void main(String[] args) {
	
		//Map<String, String> mss =  new Hashtable<String, String>();
		
		SortedMap<Employee, String> sss= new TreeMap<Employee, String>();
	
		
		sss.put(new Employee(), "Apple");
		sss.put(new Employee(), "Boy");
		sss.put(new Employee(), "Cat");
		
		System.out.println(sss);
	}

}
