import java.util.*;
import java.lang.*;
class Task3{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str = sc.next();
		StringBuffer sb = new StringBuffer();
		int max=0;StringBuffer ls=new StringBuffer();
		for(int i=1;i<str.length();){   
			if(str.charAt(i-1)+1==str.charAt(i)){
				sb.append(str.charAt(i-1)).append(str.charAt(i));
				i=i+2;
			} 
			else{
				if(sb.length()>ls.length()){
					ls=sb;
					sb.delete(0, sb.length());
				}
				i++;
			}
		}
		System.out.println("Largest consecutive sequence is:"+ls);
	}
}