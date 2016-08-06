package org.tasks;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetImpl {

	
	public static void main(String[] args) {
	
		/*LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("ravi");
		lhs.add("peter");
		lhs.add("john");
		lhs.add("jack");
		lhs.add("kamal");*/
		//LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		TreeSet<Integer> lhs = new TreeSet<Integer>();
		lhs.add(5);
		lhs.add(6);
		lhs.add(2);
		lhs.add(10);
		System.out.println(lhs);
		
	}

}
