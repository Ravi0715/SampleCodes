package org.tasks;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingValues {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();	
		System.out.println("Enter array elements");
		TreeMap<Integer, Integer> ts = new TreeMap<Integer, Integer>();
		for(int i=0;i<n;i++)
			ts.put(in.nextInt(),i);
		Set<Integer> ss =ts.keySet();
		Iterator<Integer> ii =ss.iterator();
		while(ii.hasNext())
		{
			System.out.print(ii.next()+" ");
		}
	}

}
