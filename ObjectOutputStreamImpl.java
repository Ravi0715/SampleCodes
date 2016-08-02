package practice.tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import practice.pojos.CollectionOfStudents;
import practice.pojos.Marks;
import practice.pojos.Student;



public class ObjectOutputStreamImpl implements Serializable{

	public static void main(String[] args)  {

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
			CollectionOfStudents cos = new CollectionOfStudents();
			cos.setLi(ls);
			oos.writeObject(cos);
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
				CollectionOfStudents cos = (CollectionOfStudents)ois.readObject();
				ArrayList<Student> li =cos.getLi();
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
			/*for(Student st:ls)
			{
				System.out.println(st.getsId()+" "+st.getsName()+" "+st.getsDept());
				ArrayList<Marks> am=st.getListMarks();
				for(Marks ms:am)
				{
					System.out.print(ms.getMarks()+" ");
				}
				System.out.println();
			}*/
		//System.out.println(ls);
		
		/*Student s1= new Student();
		s1.setsId("13KD1A0503");
		s1.setsName("Ravi");
		s1.setsDept("cse");
		
		Marks m1 = new Marks();
		m1.setMarks(501);
		Marks m2 = new Marks();
		m2.setMarks(768);
		Marks m3 = new Marks();
		m3.setMarks(3451);
		ArrayList<Marks> listMarks = new ArrayList<Marks>();
		listMarks.add(m1);
		listMarks.add(m2);
		listMarks.add(m3);
		s1.setListMarks(listMarks);
		System.out.println(s1.getsId()+" "+s1.getsName()+" "+s1.getsDept());
		ArrayList<Marks> am = s1.getListMarks();
		for(Marks m:am){
			System.out.print(m.getMarks()+" ");
		}
*/
	}

}
