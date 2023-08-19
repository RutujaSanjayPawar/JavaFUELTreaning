package mypack;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class BookMain {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bookid");
		int id=sc.nextInt();
		
		System.out.println("Enter Book Title");
		String title=sc.next();
		
		System.out.println("Enter Book Price");
		int price=sc.nextInt();

		Book b1=new Book();
		b1.setBookid(id);
		b1.setTitle(title);
		b1.setPrice(price);
		
		session.save(b1);
		t.commit();
		session.close();
	}

}
