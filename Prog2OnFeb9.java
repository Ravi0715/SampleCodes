package org.Arrays;
import java.util.Scanner;


public class Prog2OnFeb9 {
	public static void main(String[] args) {
		
		int a[] =new int[20];
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		System.out.println("enter the array:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				if(i%2==0)
					System.out.println("Even "+a[i]);
				
			}
			else
			{
				if(i%2==0)
					continue;
				else
					System.out.println("Odd "+a[i]);
				
			}
		
		}
	}
}
