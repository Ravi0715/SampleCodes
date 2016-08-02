import java.util.*;
public class StringSample
{

	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter String");
	String s=in.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='(')
			count++;
		if(ch==')')
			count--;
	}
	if(count==0)
		System.out.println("0");
	else
		System.out.println("1");
}
}