package org.tasks;

import java.util.Scanner;

public class NthOccurenceAndLocation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[] = new int[50];
		int num;
		System.out.println("Enter the array size");
		num=in.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<num;i++)
		{
			a[i]=in.nextInt();
		}
		int occ,loc,input,count=0;
		System.out.println("Enter the input");
		input=in.nextInt();
		System.out.println("Enter the occurence");
		occ=in.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==input)
			{
				count++;
				if(count==occ)
				{
					System.out.println("Location is "+i);
				}
			}
		}
		
	}

}
