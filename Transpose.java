package org.tasks;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int a[][] = new int[10][10];
		int i,j;
		System.out.println("Enter rows and columns of matrix");
		int r=in.nextInt();
		int c=in.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=in.nextInt();
		int b[][] = new int[10][10];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				b[j][i]=a[i][j];

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
