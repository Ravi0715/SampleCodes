// Pick the highest basic salaries of employees from different designations. 

package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
		Stack<Employee> stack = new Stack<Employee>();
		
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
				stack.push(e);	//pushing into stack
			}
			
			double max1=0.0,max2=0.0,max3=0.0;
			
			while(!stack.isEmpty()){
				Employee emp =stack.peek();  // get top of the stack
					switch(emp.getDesg()){
						case "asst.prof": 
											if(emp.getSalary().getBasic() > max1){
												max1=emp.getSalary().getBasic();
											}
											break;
						case "assoc.prof":
										if(emp.getSalary().getBasic() > max2){
											max2=emp.getSalary().getBasic();
											}
											break;
						case "prof":
									if(emp.getSalary().getBasic() > max3){
										max3=emp.getSalary().getBasic();
									}
									break;
					}
				stack.pop();
			}
			
					System.out.println("Highest Basic of Asst.Professor:"+max1);
					System.out.println("Highest Basic of Assoc.Professor:"+max2);
					System.out.println("Highest Basic of Professor:"+max3);
		}
			catch(Exception e){
				e.printStackTrace();
			}

		}

}
