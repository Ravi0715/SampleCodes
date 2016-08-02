package practice.tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


import practice.pojos.Marks;
import practice.pojos.Student;

public class OOSImpl {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no.of Students");
		int n=in.nextInt();
		ArrayList<Student> ls = new ArrayList<Student>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student "+(i+1) +" Details");
			ArrayList<Marks> am = new ArrayList<Marks>();
			int noOfSubjects;
			Student s1 = new Student();
			System.out.print("Student ID:");
			s1.setsId(in.next());
			System.out.print("Student Name:");
			s1.setsName(in.next());
			System.out.print("Student Dept:");
			s1.setsDept(in.next());
			System.out.println("Enter no. of subjects");
			noOfSubjects=in.nextInt();
			for(int j=0;j<noOfSubjects;j++)
			{
				System.out.print("Enter subject "+(j+1)+":");
				Marks m = new Marks();
				m.setMarks(in.nextDouble());
				am.add(m);
			}
			s1.setListMarks(am);
			ls.add(s1);
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\aaa\\smpl2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ls);
			System.out.println("Stored....\n");
			fos.close();
			oos.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
			try 
			{
				FileInputStream fis = new FileInputStream("D:\\aaa\\smpl2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ArrayList<Student> li =(ArrayList<Student>)ois.readObject();
				int i;
				for(Student st:li)
				{
					i=0;
					System.out.println("Student Id:"+st.getsId()+"\nStudent Name:"+st.getsName()+"\nStudent Dept:"+st.getsDept());
					ArrayList<Marks> am=st.getListMarks();
					for(Marks ms:am)
					{
						System.out.print("Marks-"+(++i)+":"+ms.getMarks()+"\n");
					}
					System.out.println();
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		

	}

}
