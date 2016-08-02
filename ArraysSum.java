package org.tasks;

import java.util.Collections;
import java.util.Scanner;

public class ArraysSum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int n = in.nextInt();
		int a[] =  new int[10];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("Enter the size of array 2");
		int n2 = in.nextInt();
		System.out.println("Enter array elements");
		int b[] = new int[10];
		for(int i=0;i<n2;i++)
			b[i]=in.nextInt();
		int max = n>n2?n:n2;
		for(int i=0;i<max;i++)
		{
			Integer obj = a[i]+b[i];
			String s = obj.toString();
			int p=0;
			while(s.length()>p)
			{
				//p++;
				System.out.println(s.charAt(p)+",");
				p++;
			}
		}
		
	}

}
