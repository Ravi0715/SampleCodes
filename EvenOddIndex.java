import java.lang.*;
import java.util.*;
import java.io.*;
class EvenOddIndex{
public static void main(String args[]){
 int arr[]=new int[30];
Hashtable<Integer,Integer> ht= new Hashtable<Integer,Integer>();
List<Integer> evenlist = new ArrayList<Integer>();
List<Integer> oddlist = new ArrayList<Integer>();
Scanner sc= new Scanner(System.in);
 System.out.println("Enter no.of elements:");
int n= sc.nextInt();
System.out.println("Enter Array Elements:");
for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 if(ht.containsKey(arr[i]))
   ht.put(arr[i],ht.get(arr[i])+1);
 else
   ht.put(arr[i],1);
}
Set<Integer> st= ht.keySet();
Iterator<Integer> ie=st.iterator();
while(ie.hasNext()){
 int num=ie.next();
 if(ht.get(num)%2==0)
  evenlist.add(num);
 else
  oddlist.add(num);
}
System.out.println("Even times repeated numbers:"+evenlist);
System.out.println("Odd times repeated numbers:"+oddlist);
}
}