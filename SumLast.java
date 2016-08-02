package org.tasks;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;

public class SumLast {

	public int sumOfDigits(int number)
	{
		int a=0,sum=0;
		while(number!=0)
		{
			a= number%10;
			number = number/10;
			sum = sum+a;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		SumLast sl = new SumLast();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number =  in .nextInt();
		Set<Integer> set =  new HashSet<Integer>();
		//add sum to set
		set.add(sl.sumOfDigits(number));
		Iterator<Integer> ii =set.iterator();
		int b=0,s1=0;
		//iterate the element in set and perform the operation
		while(ii.hasNext())
		{
			int i =ii.next();
			s1=sl.sumOfDigits(i);
		}
		System.out.println("Sum of the number upto last fold is :" + s1);
	}
}
