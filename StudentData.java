package org.student;

import java.util.Scanner;


public class StudentData {

	public static void main(String args[])
	{
		Student student[]=new Student[4];
		Marks marks[]=new Marks[6];
		for (int i = 0; i<marks.length; i++) 
		{
			Scanner r = new Scanner(System.in);
			marks[i]=new Marks();
			System.out.println("Enter the Theory external marks for student "+(i+1)+" for subject "+(i+1));
			marks[i].setsExternalMarks(r.nextInt());
			System.out.println("Enter the Theory internal marks for student "+(i+1)+" for subject "+(i+1));
			marks[i].setsInternalMarks(r.nextInt());
			System.out.println("Enter the Theory credits for student "+(i+1)+" for subject "+(i+1));
			marks[i].setsCredits(r.nextInt());
		}
		Marks marks2[]=new Marks[2];
		for (int i = 0; i < marks2.length; i++) {
			Scanner in = new Scanner(System.in);
			marks2[i]=new Marks();
			System.out.println("Enter the Lab external marks for student "+(i+1)+" for subject "+(i+1));
			marks2[i].setsExternalMarks(in.nextInt());
			System.out.println("Enter the Lab internal marks for student "+(i+1)+" for subject "+(i+1));
			marks2[i].setsInternalMarks(in.nextInt());
			System.out.println("Enter the Lab credits marks for student "+(i+1)+" for subject "+(i+1));
			marks2[i].setsCredits(in.nextInt());
		}
		for (int i = 0; i < student.length; i++) {
			Scanner in = new Scanner(System.in);
			student[i]=new Student();
			System.out.println("Enter the Student id "+(i+1));
			student[i].setsId(in.next());
			System.out.println("Enter the Student Name "+(i+1));
			student[i].setsName(in.next());
			System.out.println("Enter the Student Dept "+(i+1));
			student[i].setsDept(in.next());
			student[i].setsMarks(marks);
			student[i].setsMarks(marks2);
		}
		for (int i = 0; i < marks2.length; i++) {
			marks2[i]=new Marks();
			int sum=marks2[i].getsExternalMarks()+marks2[i].getsInternalMarks();
			System.out.println(sum);
		}
		System.out.print("ROLL-NO \t NAME \t Percentage\t");
	}
}
