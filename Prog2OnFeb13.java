package org.Arrays;

import java.util.Scanner;

public class Prog2OnFeb13 {
	
	int sum=0;
	public int getSum(int number)
	{
		if(number==0)
				return sum;
		else
		{
			sum+=(number%10);
			getSum(number/10);
		}
		return sum;
	}
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
	public static void main(String[] args) {
		
		Prog2OnFeb13 prog2OnFeb13 = new Prog2OnFeb13();
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
			int temp=prog2OnFeb13.getSum(a[i]);
			boolean b = prog2OnFeb13.isPrime(temp);
			
			if(b)
			{
				System.out.println(a[i]);
			}	
		}
	}

}
