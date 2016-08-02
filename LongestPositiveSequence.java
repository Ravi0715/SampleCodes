package org.tasks;


import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class LongestPositiveSequence {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int number = in.nextInt();
		System.out.println("Enter the elements of array");
		int a[] = new int[50];
		for(int i=0;i<number;i++)
		{
			a[i]=in.nextInt();
		}
		SortedMap<Integer, StringBuffer> sm = new TreeMap<Integer, StringBuffer>();
		int count=0;
		StringBuffer sb = new StringBuffer();
		sb.append("[ ");
		for(int i=0;i<number;i++)
		{
			if(a[i]>=0)
			{
				count++;
				sb.append(+a[i]+" ");
			}
			else if(a[i]<0)
			{
				sb.append("]");
				sm.put(count, sb);
				sb=null;
				sb  = new StringBuffer();
				sb.append("[ ");
				count=0;
			}
			if(i==number-1)
			{
				sb.append("]");
				sm.put(count, sb);
				sb=null;
				count=0;
			}
		}
		System.out.println("Count:"+sm.lastKey());
		System.out.println("Sequence:"+sm.get(sm.lastKey()));
	}

}
