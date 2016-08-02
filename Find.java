package org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.pojos.Faculty;
import org.pojos.Student;

public class Find {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int number = in.nextInt();
		//Faculty faculty[] =  new Faculty[number];
		System.out.println("Enter the employee data:");
		Vector vector =  new Vector();
		for(int i=0;i<number/*faculty.length*/;i++)
		{
			Faculty faculty = new Faculty();
			System.out.println("Enter the employee id:"+(i+1));
			faculty.setfId(in.next());
			System.out.println("Enter the employee name:"+(i+1));
			faculty.setfName(in.next());
			System.out.println("Enter the employee dept:"+(i+1));
			faculty.setfDept(in.next());
			vector.add(faculty);
		}
		System.out.println("Enter the number of students:");
		int number1 = in.nextInt();
		//Student student[] = new Student[number1];
		System.out.println("Enter the student data:");
		for(int i=0;i<number1;i++)
		{
			Student student = new Student();
			System.out.println("Enter the student id:"+(i+1));
			student.setsId(in.next());
			System.out.println("Enter the student name:"+(i+1));
			student.setsName(in.next());
			System.out.println("Enter the student dept:"+(i+1));
			student.setsDept(in.next());
			vector.add(student);
		}
		Iterator iterator = vector.iterator();
		while(iterator.hasNext())
		{
			Faculty f = (Faculty) iterator.next();
			
			if(f.getfId().startsWith("F"))
			{
				System.out.println(iterator.next());
			}
			else
			{
				System.out.println(iterator.next());
			}
		}
		

	}

}
