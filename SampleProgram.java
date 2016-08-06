package org.tasks;

import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class SampleProgram {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int n1,n2;
		System.out.println("Enter array1 size:");
		n1=in.nextInt();
		System.out.println("Enter array 1 elements");
		for(int i=0;i<n1;i++)
			a[i]=in.nextInt();
		System.out.println("Enter size 2");
		n2=in.nextInt();
		System.out.println("Enter array 2 elements");
		for(int i=0;i<n2;i++)
			b[i]=in.nextInt();
		int k=n1>n2?n1:n2;
		for(int i=0;i<k;i++)
		{
			Integer obj =a[i]+b[i];
			String s =obj.toString();
			int p=0;
			while(s.length()>p)
			{
				System.out.println(s.charAt(p)+",");
				p++;
			}
		}
		

	}

}
