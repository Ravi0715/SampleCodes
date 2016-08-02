import java.util.*;
import java.lang.*;
class Task5
{
public static void main (String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter string sequece:");
String str= sc.nextLine();
String arr[]= str.split(" ");
int maxvow=0;String ls=null;
 for(String s : arr){
  int vow=0;
  for(char ch: s.toCharArray()){
   char c= Character.toLowerCase(ch);       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
  vow++;
 }
 if(vow>maxvow){
  maxvow=vow;
  ls= s;
 } 
}
System.out.println("String which has most vowels is:"+ls+"\n no.of vowels"+maxvow);
}
}