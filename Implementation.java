import java.io.*;
import java.lang.*;
import java.util.*;
class Implementation throws IOException{
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
    try {
                        FileReader fr = new FileReader("D:\\aaa\\newemployee.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        int count=0,wordCount=0,lineCount=0;
                        try {
                                while((line=br.readLine())!=null)
                                {
                                        String arr[] = line.split(",");
                                        wordCount+=arr.length;
                                        count++;
                                        if(count<arr.length)
                                        {
                                                ++lineCount;
                                                count=0;
                                        }
 }

 if(select.euqualsIgnoreCase("line")){
   System.out.println("No.of lines="+linecount);
 }
 else if(select.equalsIgnoreCase("word")){
   System.out.println("No.of words="+wordcount);
}
else System.out.println("No.of characters"+count);
 } 
}