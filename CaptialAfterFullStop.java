package practice.tasks;

import java.util.Scanner;

public class CaptialAfterFullStop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String s=in.nextLine();
		char ch[] =s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='.')
			{
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		System.out.println();
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
