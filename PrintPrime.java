package org.tasks;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter array elements");
		int a[] = new int[10];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
					flag=1;
			}
			if(flag==0)
			{
				if(a[i]!=0)
					sb.append(a[i]+",");
			}
		}
		System.out.println(sb.toString());

	}

}
