package TablePerHierarchy;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main()
	{
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Rutuja");
		
		Regular_Emp e2=new Regular_Emp();
		e2.setName("Gauri");
		e2.setSalary(10000);
		e2.setBonuse(5000);
		
		Contract_Emp e3=new Contract_Emp();
		e3.setName("Rachana");
		e3.setPay_per_hour(500);
		e3.setContract_period("24 Hours");
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		t.commit();
		session.close();
	
	}
}
