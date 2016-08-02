package org.tasks;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class MostRepeatedNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter Elements");
		int a[] = new int[10];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i], 1);
			}
			
		}
		int max1=0;
		for(int x:hm.values())
		{
			if(x>max1)
				max1=x;
		}
		System.out.print("The most repeated numbers are:");
		for(Map.Entry<Integer, Integer> en:hm.entrySet())
		{
			if(max1==en.getValue())
				System.out.print(en.getKey()+" ");
		}
	}

}
