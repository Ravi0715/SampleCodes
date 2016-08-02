package org.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.comparator.IdComparator;
import org.pojos.Employee;
import org.pojos.VoterCard;

public class VoterCardExample {

	public static void main(String[] args) throws IOException {
		
		HashMap<Set<VoterCard> , List<Employee>> hve = new HashMap<Set<VoterCard>, List<Employee>>();
		Set<VoterCard> set = new HashSet<VoterCard>();
		List<Employee> list = new ArrayList<Employee>();
		VoterCard vc = new VoterCard();
		//Employee employee = new Employee();
		Random r = new Random();
		int votercardNumber = r.nextInt(10);
		vc.setVotercardNumber(votercardNumber);
		set.add(vc);
		BufferedReader br = new BufferedReader(new FileReader("D:\\employee\\employee.txt"));
		String line;
		while((line=br.readLine())!=null)
		{
			String arr[]=line.split(",");
			Employee employee = new Employee();
			employee.seteId(arr[0]);
			employee.seteName(arr[1]);
			employee.setCity(arr[2]);
			employee.setAddress(arr[3]);
			list.add(employee);
		}
		hve.put(set, list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\employee\\newemployee.txt",true));
		Collection<List<Employee>> cle=hve.values();
		Iterator<List<Employee>> iee=cle.iterator();
		while(iee.hasNext())
		{
			List<Employee> le =iee.next();
			Iterator<Employee> ie =le.iterator();
			while(ie.hasNext())
			{
				Employee emp =ie.next();
				bw.write(vc.getVotercardNumber()+","+emp.geteId()+","+emp.geteName()+","+emp.getCity()+","+emp.getAddress());
				bw.newLine();
			}
		}
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\employee\\employee.txt"));
		String l;
		List<Employee> l1= new ArrayList<Employee>();
		while((l=br1.readLine())!=null)
		{
			String arr[]=l.split(",");
			Employee empl = new Employee();
			empl.seteId(arr[1]);
			empl.seteName(arr[2]);
			empl.setCity(arr[3]);
			empl.setAddress(arr[4]);
			l1.add(empl);
		}
		Collections.sort(l1, new IdComparator());
		
		//System.out.println(votercardNumber);
	}

}
