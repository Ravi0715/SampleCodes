package org.Arrays;

import java.util.Scanner;

public class Prog2OnFeb12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[]=new int[20];
		int n,source,destination,k = 0,r = 0,p = 0,t = 0;
		System.out.println("enter array size:");
		n=in.nextInt();
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter Source");
		source=in.nextInt();
		System.out.println("Enter Destination");
		destination=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==source)
			{
				if(k==0)
				{
					r=i;
					k++;
				}
				else
				{
					t = i;
					k++;
					System.out.println("Distance is "+(t-r-1));
				}
			}
			if(a[i]==destination)
			{
				p=i;
				System.out.println("Distance is "+(p-r-1));
			}
			
			
		}
		
	}

}
