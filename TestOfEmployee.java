package org.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.comparators.SalaryComparator;
import org.pojos.Employee;
import org.pojos.Salary;

public class TestOfEmployee {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String name=in.next();
		System.out.println("Enter the employee designation");
		String desg=in.next();
		Salary salary = new Salary();
		Employee employee = new Employee();
		List<Employee>  see = new ArrayList<Employee>();
		if(desg.equalsIgnoreCase("professor"))
		{
			salary.setBasic(20000);
			salary.setDa(45000);
			salary.setHra(5000);
			employee.setName(name);
			employee.setDesg(desg);
			employee.setSalary(salary);
			see.add(employee);
		}
		else if(desg.equalsIgnoreCase("asocprof"))
		{
			
			salary.setBasic(10000);
			salary.setDa(20000);
			salary.setHra(2500);
			employee.setName(name);
			employee.setDesg(desg);
			employee.setSalary(salary);
			see.add(employee);
		}
		else
		{
			salary.setBasic(5000);
			salary.setDa(10000);
			salary.setHra(1250);
			employee.setName(name);
			employee.setDesg(desg);
			employee.setSalary(salary);
			see.add(employee);
		}
		Collections.sort(see, new SalaryComparator());
		Iterator<Employee> ies = see.iterator();
		int count=0;
		
		while(ies.hasNext())
		{
			Employee e = ies.next();
			if(count>1)
				break;
			//System.out.println(e.getName()+" "+e.getSalary().getBasic());
			
		}

	}

}
