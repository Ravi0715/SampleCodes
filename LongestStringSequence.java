import java.util.*;

public class LongestStringSequence {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.next();
		List<Character> li = new ArrayList<Character>();
		TreeMap<Integer, List<Character>> tm = new TreeMap<Integer, List<Character>>();
		char c[] =s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==c.length-1)
			{
				if(c[i]-1==c[i-1])
				{
					li.add(c[i]);
					tm.put(li.size(),li);
					li=new ArrayList<Character>();
					break;
				}
			}
			if(c[i]+1==c[i+1])
			{
				li.add(c[i]);
			}
			else
			{
				if(li.isEmpty())
				{
					continue;
				}
				else
				{
						li.add(c[i]);
						tm.put(li.size(),li);
						li=new ArrayList<Character>();
				}
			}
		}
		System.out.println("Longest String Sequence:"+tm.get(tm.lastKey()));
	}

}
