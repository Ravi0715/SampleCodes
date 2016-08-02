package org.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AsciiCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter Elements");
		int a[] = new int[10];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i], 1);
			}			
		}
		int v[] = new int[10];
		int k[] = new int[10];
		int p=0;
		for(Map.Entry<Integer, Integer> en:hm.entrySet())
		{
			k[p]=en.getKey();
			v[p]=en.getValue();
			p++;
		}
		for(int i=0;i<p;i++)
		{
			for(int j=i+1;j<p;j++)
			{
				if(v[i]==v[j])
				{
					if(k[i]<k[j])
					{
						int temp=k[i];
						k[i]=k[j];
						k[j]=temp;
					}
				}
				if(v[i]<v[j])
				{
					int temp=v[i];
					v[i]=v[j];
					v[j]=temp;
					temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
			System.out.print(k[i]+" "+v[i]+"\n");
		}

	}

}
