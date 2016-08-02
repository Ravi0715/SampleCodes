import java.util.*;
public class CharactersCount
{
	public static void main(String args[])
	{
		String s;
		Scanner in = new Scanner(System.in);
		s=in.nextLine();
		String str[] =s.split(" ");
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int cnt=0,count=0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				char ch=str[i].charAt(j);
				if(hm.containsKey(ch))
{
				count=hm.get(ch).intValue();
					hm.put(ch,++count);
}
				else
					hm.put(ch,1);
			}
		}
		System.out.println(hm);
	}

}
