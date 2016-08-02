package org.tasks;

import java.util.Scanner;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;

public class TaskTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no.of elements");
		int n=in.nextInt();
		System.out.println("enter array elements");
		int a[] = new int[10];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		int evenMax=0;
		for(int i=0;i<n;i++)
		{
			if((a[i]>evenMax)&&((a[i]%2)==0))
				evenMax=a[i];
		}
		System.out.println("Prime numbers before The Greatest Even Number are:");
		int p;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>evenMax||a[i]==1||a[i]==0)
			{
				continue;
			}
			
			else
			{
				p=0;
				for(int j=2;j<=a[i]/2;j++)
				{
					if(a[i]%j==0)
					{
						p=1;
					}
				}
				if(p==0)
				{
					System.out.print(a[i]+" ");
				}
			}	
		}
	}

}
