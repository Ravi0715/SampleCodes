package practice.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=in.nextInt();
		Set<Character> sc = new HashSet<Character>();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			System.out.print("Enter String  "+(i+1)+" : ");
			str[i]=in.next();
			if(i==0)
			{
				for (char ch : str[0].toCharArray()) {
					sc.add(ch);
				}
			}
		}
		StringBuffer sb=  new StringBuffer();
		for(char ch:sc)
		{
			boolean b=true;
			for(int i=1;i<str.length;i++)
			{
				if(str[i].contains(Character.toString(ch)))
					continue;
				else
					b=false;
			}
			if(b&&!sb.toString().contains(Character.toString(ch)))
				sb.append(ch+",");
		}
		System.out.println("Common Characters in the array: "+sb);
	}

}
