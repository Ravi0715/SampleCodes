// Add the basic of Rs. 5000/- for all employees who are having grade points greater 
   // than equal to 9.0,  and print all the info. 

package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		try{
			FileReader fr = new FileReader("D://aaa//employee.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			Employee e;
			Salary s;
			while((line=br.readLine())!=null){
				String row[]= line.split(",");
				e = new Employee(); s= new Salary();
				
				s.setBasic(Double.parseDouble(row[4]));
				s.setDa(Double.parseDouble(row[5]));
				s.setHra(Double.parseDouble(row[6]));
				
				e.seteId(row[0]);e.seteName(row[1]);e.setDept(row[3]);
				e.setDesg(row[2]);e.setGrade(Double.parseDouble(row[7]));
				e.setSalary(s);
				set.add(e);
			}
			
			Iterator<Employee> loop = set.iterator();
			
			while(loop.hasNext()){
				Employee emp= loop.next();
				if(emp.getGrade()>=9.0){
					double basic = emp.getSalary().getBasic()+5000.00;
					System.out.println(emp.geteId()+" "+emp.getDesg()+" "+basic);		
				}
			}
		}	

		catch(Exception e){
			e.printStackTrace();
		}
	}

}
