import java.util.*;
import java.lang.*;
class Task2
{
public static void main (String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter string:");
 String str = sc.next();
 StringBuffer sb = new StringBuffer();
 int max=0;String ls=null;
 for(int i=0;i<str.length()-1;i++){   if(str.charAt(i)+1!=str.charAt(i+1)){
     sb.append(str.charAt(i));
     if(sb.length()>max){
       max=sb.length();
       ls=sb.toString();
     } 
     sb=null; 
     sb= new StringBuffer(); 
   }
   else
    sb.append(str.charAt(i));
     
 }
System.out.println("Largest consecutive sequence is:"+ls);
}
}