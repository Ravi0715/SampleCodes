package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.pojos.EmployeeModelClass;
import org.pojos.Salary;

public class MapImplementation {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("D:\\bigdata\\newemployee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Map<String, EmployeeModelClass> msemc = new HashMap<String, EmployeeModelClass>();
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
			msemc.put(emc.geteId(), emc);
		}
		Set<Entry<String, EmployeeModelClass>> ses = msemc.entrySet();
		Iterator<Entry<String, EmployeeModelClass>> ies = ses.iterator();
		while(ies.hasNext())
		{
			Entry<String, EmployeeModelClass> es = ies.next();
			String key = es.getKey();
			EmployeeModelClass em = es.getValue();
			if(em.getGradePoint()>90)
			{
				System.out.println("Employee id: "+key+"\nEmployee Name:"+em.geteName());
				System.out.println("Previous Basic Salary: "+em.getSalary().getBasic());
				System.out.println("Previous Net Salary: "+(em.getSalary().getBasic()+em.getSalary().getDa()+em.getSalary().getHra()));
				System.out.println("Increment 5000 to Basic Salary: "+(em.getSalary().getBasic()+5000));
				System.out.println("After Increment Net Salary: "+((em.getSalary().getBasic()+5000)+em.getSalary().getDa()+em.getSalary().getHra())+"\n");
			}
		}
		br.close();
		fr.close();
	}

}
