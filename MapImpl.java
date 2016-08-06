package org.tasks;

import java.util.HashMap;
import java.util.Hashtable;

public class MapImpl {

	public static void main(String[] args) {
		
		//Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		HashMap<Integer, String> ht = new HashMap<Integer, String>();
		ht.put(1, "String");
		ht.put(2, "Ravi");
		ht.put(null, "arrays");ht.put(null, "array");
		System.out.println(ht);
	}

}
