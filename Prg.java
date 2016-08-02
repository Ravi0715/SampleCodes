package org.Arrays;


import java.util.Scanner;

public class Prg {
	public static void main(String[] args) {
		
		int arr[] =new int[20];
		int i,n,j,k,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		n=s.nextInt();
		System.out.println("enter the array:");
		for(i=0;i<n;i++)
				arr[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			x=0;
			if(arr[i]==1)
					x=1;
			for(j=1;j<arr[i];j++)
				for(k=1;k<arr[i];k++)
					if((j*k)==arr[i])	
						x=1;
			if(x==0)
				System.out.println(arr[i]);
		}
	
	}
}
