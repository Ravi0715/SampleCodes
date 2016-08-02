package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Stack;

import org.pojos.EmployeeModelClass;
import org.pojos.Salary;

public class StackImplementation {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("D:\\bigdata\\newemployee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Stack<EmployeeModelClass> semc = new Stack<EmployeeModelClass>();
		while((line=br.readLine())!=null)
		{
			String arr[] =line.split(",");
			Salary salary = new Salary();
			salary.setBasic(Double.parseDouble(arr[4]));
			salary.setDa(Double.parseDouble(arr[5]));
			salary.setHra(Double.parseDouble(arr[6]));
			EmployeeModelClass emc = new EmployeeModelClass();
			emc.seteId(arr[0]);
			emc.seteName(arr[1]);
			emc.setDept(arr[2]);
			emc.setDesg(arr[3]);
			emc.setSalary(salary);
			emc.setGradePoint(Integer.parseInt(arr[7]));
			semc.push(emc);
		}
		Iterator<EmployeeModelClass> iemc = semc.iterator();
		while(iemc.hasNext())
		{
			EmployeeModelClass em = iemc.next();
			if(em.getDept().equals("cse"))
			{
				System.out.println(em.geteId()+" "+em.geteName()+" "+em.getDesg()+" "+(em.getSalary().getBasic()+em.getSalary().getDa()+em.getSalary().getHra())+" "+em.getGradePoint());
			}
		}
		br.close();
		fr.close();
	}

}
