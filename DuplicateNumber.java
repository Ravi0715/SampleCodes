package org.tasks;




import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int number = in.nextInt();
		System.out.println("Enter the numbers");
		int a[] = new int[number];
		for(int i=0;i<number;i++)
			a[i]=in.nextInt();
		Hashtable<Integer, Integer> hii = new Hashtable<Integer, Integer>();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int count1=0;
			int num=a[i];
			if(hii.containsKey(num))
			{
				count1=hii.get(num).intValue();
				hii.put(num, ++count1);
			}
			else
			{
				hii.put(num, 1);
			}
		}
		System.out.println("Duplicate elements are:");
		Set<Entry<Integer, Integer>> seii =hii.entrySet();
		Iterator<Entry<Integer, Integer>> ieii =seii.iterator();
		while(ieii.hasNext())
		{
			Entry<Integer, Integer> eii =ieii.next();
			if(eii.getValue()>1)
			{
				count++;
				System.out.println(eii.getKey()+" ");
			}
		}
		System.out.println("Total Duplicate elements count "+count);
	}

}
