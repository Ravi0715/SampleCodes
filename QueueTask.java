//Remove all the employees from queue who are having grade points less than 8.00 and print others.

package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<Employee> queue = new LinkedList<Employee>();
		
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
				queue.add(e);	//pushing into queue
			}
			
			Queue<Employee> newQueue = new LinkedList<Employee>();
			
			while(!queue.isEmpty()){
				Employee emp = queue.poll();
				if(emp.getGrade()>8.0){
					System.out.println(emp.geteId()+" "+emp.geteName()+" "+emp.getGrade());
				}
				queue.remove(emp);
			}
			
			
		}
			catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
