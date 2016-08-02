import java.lang.*;
import java.util.*;
import java.io.*;
class EmployeeFinding{
public static void main(String args[]) throws IOException{
Scanner sc= new Scanner(System.in); 
FileReader fr= new FileReader("D:\\aaa\\employee.txt");
BufferedReader br= new BufferedReader(fr);
System.out.println("Enter employee id:");
String eId=sc.next();
String det;
int x=0;
while((det=br.readLine())!=null){
  String a[]=det.split(",");
  if(a[0].equalsIgnoreCase(eId)){
    System.out.println(a[0]+" "+a[1]+" " +a[2]);
     x=1;
     break;
  }
}
if(x==0){
try{ 
  throw new EmployeeNotFoundException("employee not is not found");
}
catch(EmployeeNotFoundException exp){
 exp.printStackTrace();
}
}
}
}
class EmployeeNotFoundException extends Exception{
 public EmployeeNotFoundException(String str){
 super(str);
}
}