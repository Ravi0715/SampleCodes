package org.tasks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SampleTask {
	
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = in.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
	}

}
