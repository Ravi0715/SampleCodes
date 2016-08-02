import java.util.*;
public class LineReverse
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s= new String();
		System.out.println("Enter String");
		s=in.nextLine();
		String str[]= s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));	
			}
			System.out.print(" ");
		}
		
	}

}