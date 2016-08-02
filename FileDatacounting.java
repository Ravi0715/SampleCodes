import java.io.*;
import java.lang.*;
import java.util.*;
class FileDatacounting throws IOException{
public static void main(String args[]){
 Counter word= new Counter("word");
 word.start();
 Counter line= new Counter("line");
 line.start();
 Counter ch= new Counter("ch");
 ch.start();
}
}
class Counter extends Thread{
 String select;
 public Counter(String select){
  this.select=select; 
 }
synchronized public void run(){
 try{
 FileInputStream fin=new FileInputStream("D:\\aaa\\one.txt");
char c;
int linecount=0,wordcount=0,count=0;
while((c=(char)fin.read())!=-1){
 if(c==' ' ||c=='\t')
  wordcount++;
 else if(c=='\n')
  linecount++;
 count++;
}
 if(select.euqualsIgnoreCase("line"))
   System.out.println("No.of lines="+linecount);
 else if(select.equalsIgnoreCase("word"))
   System.out.println("No.of words="+wordcount);
else System.out.println("No.of characters"+count);
 }
 catch(Exception e){
  e.printStackTrace();
 }
 } 
}