package ll;

import java.util.Scanner;

public class NEw {


	public static void main(String[] args) {
		int n;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the number");
		n=r.nextInt();
		try
		{
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println("Prime Number "+i);
				}
				else
				{
					System.out.println("Composite Number"+i);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
