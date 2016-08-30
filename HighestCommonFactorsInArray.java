package practice.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class HighestCommonFactorsInArray {
	
	public static HashMap<Integer, List<Integer>> returnFactors(int a[])
	{
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
		for(int i=0;i<a.length;i++)
		{
			List<Integer> li = new ArrayList<Integer>();
			for(int j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
					li.add(j);
			}
			//li.add(a[i]);
			hm.put(a[i], li);
		}
		return hm;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter elements");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		HashMap<Integer, List<Integer>> hm =HighestCommonFactorsInArray.returnFactors(a);
		List<Integer> li=hm.get(a[0]);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int x:li)
		{
			int count=0;
			for(List<Integer> al:hm.values())
			{
				if(al.contains(x))
					count++;
					
			}
			if(count==hm.size()&&x!=1)
				ts.add(x);
		}
		if(ts.isEmpty())
			System.out.println("No Common Factors..");
		else
			System.out.println("Highest Common Factor:"+ts.last());
		
		
	}

}
