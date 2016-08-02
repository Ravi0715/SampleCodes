package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import org.pojos.EmployeeModelClass;
import org.pojos.Salary;

public class QueueImplementation {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("D:\\bigdata\\newemployee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Queue<EmployeeModelClass> qemc =new LinkedList<EmployeeModelClass>();
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
			qemc.offer(emc);
		}
		Iterator<EmployeeModelClass> iemc = qemc.iterator();
		while(iemc.hasNext())
		{
			EmployeeModelClass em =iemc.next();
			if(em.getGradePoint()>90&&em.getDesg().equals("asocprof"))
				System.out.println(em.geteId()+" "+em.geteName()+" "+em.getDesg()+" "+(em.getSalary().getBasic()+em.getSalary().getDa()+em.getSalary().getHra())+" "+em.getGradePoint()+" "+em.getDept());
		}
		br.close();
		fr.close();
	}

}
