package org.kartheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
	public static void main(String[] args) throws IOException{

		SortedMap<String, Employee> ss1= new TreeMap<String, Employee>();
		
		
		Map<String, Employee> mp= new Hashtable<String, Employee>();
		FileReader fr = new FileReader("D:\\kartheek\\employee.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		Employee emp;
		while((s=br.readLine())!=null){
			if(s.equals("stop"))
				break;
			String sa[] = s.split(",");
			emp = new Employee();
			emp.setDept(sa[2]);emp.setDesg(sa[3]);
			emp.seteName(sa[1]);emp.setExp(Integer.parseInt(sa[4]));
			mp.put(sa[0],emp);
		}
		
		//Collection<Employee> ce= mp.values();
		
		Set<Entry<String,Employee>> emm= mp.entrySet();
		Iterator<Entry<String,Employee>> iee = emm.iterator();
		SortedSet<Employee> sse = new TreeSet<Employee>(new ExpComparator());
		
		while(iee.hasNext()){
			Entry<String, Employee> ess= iee.next();
			sse.add(ess.getValue());
		}
		
		Iterator<Employee> ise= sse.iterator();
		
		while(ise.hasNext()){
			Employee ee= ise.next();
			System.out.println(ee.geteName()+" "+ee.getDesg());
		}
		
		br.close();fr.close();
	}

}
