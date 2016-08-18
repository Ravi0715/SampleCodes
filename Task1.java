package practice.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static StringBuffer findMaxMin(int n,int a[],int size,int m)
	{
		StringBuffer sb=new StringBuffer();
		Arrays.sort(a);
		int maxLoc=a.length-n;
		int minLoc=m-1;
		for(int i=0;i<a.length;i++)
		{
			if(i==maxLoc)
				sb.append("Biggest: "+a[i]);
			if(i==minLoc)
				sb.append("Lowest: "+a[i]+" ");
		}
		return sb;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size:");
		int size=in.nextInt();
		System.out.println("Enter the elements of array");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		System.out.println("Enter nth biggest number");
		int n=in.nextInt();
		System.out.println("Enter mth lowest number");
		int m=in.nextInt();
		System.out.println(Task1.findMaxMin(n, a,size,m));
	}

}
