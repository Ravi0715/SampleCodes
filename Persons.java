import java.util.*;
import java.lang.*;
import java.io.*;
class Persons{
public static void main(String args[]){
 Lottery p1 = new Lottery();
 p1.setName("Lakshman");
 p1.start();
 Lottery p2= new Lottery();
 p2.setName("Venky");
 p2.start();
 Lottery p3 = new Lottery();
 p3.setName("Naveen");
 p3.start();
 Lottery p4 = new Lottery();
 p4.setName("Sai");
 p4.start();
}
}
class Lottery extends Thread{
 static int amount=15000;
synchronized public void run(){
 try{
 if(amount>0){
 System.out.println("congraulations  "+Thread.currentThread().getName()+"  you had got"+amount);
 amount-=5000;
 }
 else
  throw new LotteryTimeoutException("sorry ...lottery time out..");
 }
 catch(LotteryTimeoutException time){
  time.printStackTrace();
 }
 }
}
class LotteryTimeoutException extends Exception{
 public LotteryTimeoutException(String str){
      super(str);
     }
}