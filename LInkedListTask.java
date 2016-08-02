// List out all the employees from the Linked List and print the employee details with total salaries..

package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class LInkedListTask {

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<Employee>();
		
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
				
				list.offer(e);
				
			}
			int i=0;
			while(!list.isEmpty()){
				Employee emp=  list.getFirst();
				double gross= emp.getSalary().getBasic()+emp.getSalary().getDa()+emp.getSalary().getHra();
				System.out.println(emp.geteId()+" "+emp.geteName()+" "+emp.getDesg()+" "+gross);
				list.removeFirst();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
