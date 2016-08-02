package org.Arrays;

import java.util.Scanner;

public class SamplePr
{
    public boolean isPrime(int number)
	{
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args)
    {
    	SamplePr mc = new SamplePr();
    	Scanner in = new Scanner(System.in);
    	int a[]=new int[20];
		int n;
		System.out.println("Enter size");
		n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{  
			boolean b=mc.isPrime(a[i]);
			if(b)
			{
				System.out.println(a[i]);
			}
		}
    }
}