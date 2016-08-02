package org.tasks;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateSample {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int number = in.nextInt();
		System.out.println("Enter the elements of array");
		int a[] = new int[number];
		for(int i=0;i<number;i++)
			a[i] = in.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		int count=0;
		System.out.print("Duplicate elements are: ");
		for(int element:a)
		{
			if(hs.contains(element))
			{
				System.out.print(" "+element);
				count++;
			}
			hs.add(element);
		}
		System.out.println("\nNo. of duplicate elements are:"+count);
	}

}
