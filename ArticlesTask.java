package practice.tasks;

import java.util.Scanner;

public class ArticlesTask {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String para=in.nextLine();
		String arr[]=para.split(" ");
		int count=0,aCount=0,anCount=0,theCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("a"))
			{
				count++;
				aCount++;
				if(arr[i+1].equals("an"))
				{
					count++;
					anCount++;
					arr[i+1]=" ";
				}
			}
			if(arr[i].equals("an"))
			{
				anCount++;
				count++;
			}
			if(arr[i].equals("the"))
			{
				theCount++;
				count++;
			
			}	
		}
		System.out.println("Articles A:"+aCount+" An:"+anCount+" the:"+theCount);
		System.out.println("No.Of Articles:"+count);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(" "))
				continue;
			System.out.print(arr[i]+" ");
		}
	}

}
