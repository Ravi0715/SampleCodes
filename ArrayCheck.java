import java.util.*;
class ArrayCheck
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a[] = new int[12];
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		int count;
		int b[] = new int[12];
		int c[] = new int[12];
		int p=0;
		
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count%2==0)
			{
				System.out.print(a[i]+" ");
				//b[p++]=a[i];
				//count=0;
			}
			else
			{
				System.out.print(a[i]+" ");
				//c[p++]=a[i];
				//count=0;
			}	
		}
		System.out.print("Even:");
		for(int i=0;i<b.length;i++);
		//	System.out.print(b[i]+" ");
		System.out.print("Odd:");
		for(int i=0;i<c.length;i++);
		//	System.out.print(c[i]+" ");
	}
}