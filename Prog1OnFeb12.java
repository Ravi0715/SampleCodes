package org.Arrays;

import java.util.Scanner;

public class Prog1OnFeb12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[]=new int[20];
		int n;
		System.out.println("enter size");
		n=in.nextInt();
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			int sqrt = (int) Math.sqrt(a[i]);
			if((sqrt*sqrt)==a[i])
			{
				System.out.println("Perfect Squares are "+a[i]);
			}
		}

	}

}
