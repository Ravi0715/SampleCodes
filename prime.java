package org.Arrays;
import java.util.Scanner;


class prime
{
	public static void main(String[] args)
	{
		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter upto which number prime numbers are needed");
		n=s.nextInt();
		int a[]=new int[12];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			p=0;
			for(int j=0;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(a[i]);
		}
	}
}