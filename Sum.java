import java.util.*;
import java.io.*;
public class Sum{
    public static void main(String args[]){
        int a,b,c;
        System.out.println("Enter numbers");
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println(c);
    }
}