package mypack;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;
import javax.persistence.*;
public class StudentMain {

	public static void main(String args[])
	{
		Configuration c=new Configuration();   //confi is a class
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();   // SessionFactory it is an interface
		Session session=factory.openSession();          
		Transaction t=session.beginTransaction();
		
//		Student s1=new Student();
//		s1.setRollno(101);
//		s1.setMarks(50);
//		s1.setName("Rutuja");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student RollNo ,Marks and  Name");
		int rollno=sc.nextInt();
		int marks=sc.nextInt();
		String name=sc.next();
		
		Student s1=new Student();
		s1.setRollno(rollno);
		s1.setMarks(marks);
		s1.setName(name);
		
		session.save(s1);
		t.commit();
		session.close();
		
	}
}
