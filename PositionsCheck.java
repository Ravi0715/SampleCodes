import java.util.*;
public class PositionsCheck
{
	public static void main(String args[])
	{
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		s=in.next();
		HashMap<Character,StringBuffer> hm = new HashMap<Character,StringBuffer>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			//sb = new StringBuffer();
			char ch = s.charAt(i);
			if(hm.containsKey(ch))
			{
				sb = hm.get(ch);
				sb.append(","+i);
				hm.put(ch,sb);
			}
			else
			{
				sb.append(i);
				hm.put(ch,sb);
			}		
		}
		System.out.println(hm);
	}
}