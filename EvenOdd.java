import java.util.*;
import java.util.Map.Entry;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Hashtable<Integer,Integer> hm = new Hashtable<Integer,Integer>();
		System.out.println("Enter no. of elements");
		int n = in.nextInt();
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
		{
			int ele=in.nextInt();
			if(hm.containsKey(ele))
			{
				hm.put(ele,hm.get(ele)+1);
			}
			else
				hm.put(ele,1);
		}
		Set<Entry<Integer,Integer>> se = hm.entrySet();
		Iterator<Entry<Integer,Integer>> iee = se.iterator();
		int c=0,c1=0;
		while(iee.hasNext())
		{
			Entry<Integer,Integer> en =iee.next();
			if((en.getValue()%2)==0)
			{
				c++;
				if(c<=1)
					System.out.print("Even: ");
				System.out.print(en.getKey()+" ");
			}
			else
			{
				c1++;
				if(c1<=1)
					System.out.print("Odd: ");
				System.out.print(en.getKey()+" ");
			}
		}
	}
}