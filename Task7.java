import java.lang.*;
import java.util.*;
class Task7{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 char[] vow = {'a','e','i','o','u'};
 System.out.println("enter character");
char ch = sc.next().charAt(0);
int count=0;
SortedMap<Integer,Character> mp = new TreeMap<Integer,Character>();
ch = Character.isUpperCase(ch)?Character.toLowerCase(ch):ch;
for(char c: vow){
  count = ch-c;
  if(count<0)
   count=-(count);
  count=count%24;
  mp.put(count,c);
}
System.out.println(mp);
System.out.println("nearest vowel is: "+mp.get(mp.firstKey()));
}
}