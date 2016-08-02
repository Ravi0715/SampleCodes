import java.util.*;
public class Positions
{
	public static void main(String args[])
	{
		String s;
		Scanner in = new Scanner(System.in);
		s=in.next();
		HashMap<Character,Set<Integer>>
			hm = new HashMap<Character,Set<Integer>>();
		Set<Integer> si = new HashSet<Integer>();
		Set<Character> sc = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			sc.add(ch);
		}
	System.out.println(si);
		Iterator<Character> ic =sc.iterator();
		/*while(ic.hasNext())
		{
			char c = ic.next();*/
			for(int i=0;i<s.length();i++)
			{
				char q=s.charAt(i);
				if(sc.contains(q))
					si.add(i);
			}
		//	hm.put(c,si);
		//}
		System.out.println(si);
	}
}