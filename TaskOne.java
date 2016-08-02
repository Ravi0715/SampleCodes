package org.tasks;
import java.util.*;
public class TaskOne {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter Array elements");
		int a[] =new int[10];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("Enter x and y value");
		int x=in.nextInt();
		int y=in.nextInt();
		int c[] = new int[10];
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x||a[i]==y)
			{
				c[cnt]=i;
				cnt++;
				
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==0)
				break;
			else
			{
				System.out.println(c[i+1]-c[i]-1);
				break;
			}
		}
	}
}
