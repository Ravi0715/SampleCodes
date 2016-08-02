// Get all the employees who are top in their grade point in descending oreder using Map. 

package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class MapTask {

	public static void main(String[] args) {
		
		Map<String, Employee> map = new HashMap<String, Employee>();
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
				
				map.put(e.geteId(), e);
			}
		
			 Set<Entry<String, Employee>> set= map.entrySet();
			 
			 Iterator<Entry<String, Employee>> loop= set.iterator();
			 
			 List<Employee> list = new Vector<Employee>();
			 
			 while(loop.hasNext()){
				 Entry<String, Employee> emp= loop.next();
				 
				 list.add(emp.getValue());
			 }
			 
			 Collections.sort(list,new GradeComparator());
			 
			 Iterator<Employee> loop1 =list.iterator();
			 
			 while(loop1.hasNext()){
				 Employee emp1 = loop1.next();
				 System.out.println(emp1.geteId()+" "+emp1.geteName()+" "+emp1.getGrade());
			 }
		}
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}
			

	}

}
