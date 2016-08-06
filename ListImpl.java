package org.tasks;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListImpl {


	public static void main(String[] args) {
		
		//Vector<Integer> li = new Vector<Integer>();
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(2);li.add(3);
		li.add(5);li.add(6);li.add(9);
		ListIterator<Integer> lis = li.listIterator(li.size());
		/*System.out.println("Forward:");
		while(lis.hasNext())
		{
			
			System.out.println(lis.next());
		}*/
		System.out.println("Backward:");
		while(lis.hasPrevious())
		{
			System.out.println(lis.previous());
		}
		
		
		//Enumeration<Integer> ei;
	}

}
