package org.Arrays;

import java.util.Scanner;

public class Prog1OnFeb10 {

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int x,k;
		int a[]=new int[20];
		System.out.println("Enter the size of an array");
		int n=in.nextInt();
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the value of x");
		x=in.nextInt();
		System.out.println("Enter the value of k");
		k=in.nextInt();
		System.out.println("After replacing");
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				a[i]=k;
			}
			System.out.println(a[i]);
		}
	}
}
