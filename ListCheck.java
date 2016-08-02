package org.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n = in.nextInt();
		System.out.println("Enter array");
		List<Integer> li = new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++)
		{
			li.add(in.nextInt());
		}
		Iterator<Integer> iii =li.iterator();
		Set<Integer> si =  new HashSet<Integer>();
		int count =0;
		while(iii.hasNext())
		{
			Integer i= iii.next();
			if(si.contains(i))
			{
				count++;
				if(count<=1)
				{
					System.out.println(i);
				}
			}
			else
				si.add(i);
		}
		
	}

}
