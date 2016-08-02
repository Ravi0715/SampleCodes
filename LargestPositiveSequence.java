package org.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class LargestPositiveSequence {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int number = in.nextInt();
		System.out.println("Enter the elements of array");
		int a[] = new int[50];
		for(int i=0;i<number;i++)
			a[i]=in.nextInt();
		SortedMap<Integer, List<Integer>> sm = new TreeMap<Integer, List<Integer>>();
		int count=0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<number;i++)
		{
			if(a[i]>=0)
			{
				count++;
				list.add(a[i]);
			}
			else if(a[i]<0)
			{
				sm.put(count, list);
				list = new ArrayList<Integer>();
				count = 0;
			}
			if(i==number-1)
			{
				sm.put(count, list);
				count=0;
			}
		}
		System.out.println("Count:"+sm.lastKey());
		List<Integer> lii =  sm.get(sm.lastKey());
		Iterator<Integer> ii =lii.iterator();
		System.out.print("Largest Positive Sequence is:");
		while(ii.hasNext())
		{
			System.out.print(" "+ii.next());
		}
	}

}
