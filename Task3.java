package org.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[10];
		int max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		List<Integer> li = new ArrayList<Integer>();
		int f=0,s=1,next=0;
		next=f+s;
		while(next<max)
		{
			li.add(next);
			f=s;
			s=next;
			next=f+s;	
		}
		for(int i=0;i<a.length;i++)
		{
			if(li.contains(a[i]))
			{
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
