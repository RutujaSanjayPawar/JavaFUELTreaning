package com.example.jpqlsingleresultlist;

import java.util.List;
import java.util.Scanner;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


@Repository
public class MyRepository {
	@PersistenceUnit
	private EntityManagerFactory emf;
	void getData()
	{
		EntityManager em;
		em=emf.createEntityManager();
		String jsql=" ";
		Query qu;
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println();
			System.out.println("You have select operation ");
			System.out.println("1 -> Select All Record ");
			System.out.println("2 -> Select Single Record");
			
			System.out.println("Enter your choice : ");
			 ch = sc.nextInt();
			
			
			if(ch==1)
			{
				System.out.println("---------------------------");
				em.getTransaction().begin();
				jsql="select e from Student1 as e";
				qu=em.createQuery(jsql);
				List<Student1> stdliList=qu.getResultList();
				System.out.println("Print All Record from Table ");
				
				for(Student1 s1:stdliList)
				{
					System.out.println("Student ID : "+s1.getId()+"Student Name : "+s1.getName());
				}
				System.out.println("-------------------------------");
				
			}
			else if(ch==2)
			{
				System.out.println("---------------------------");
				System.out.println("Enter Student Id who you want Print");
				int id1=sc.nextInt();
				jsql="select e from Student1 e where e.id="+id1+"";
				qu=em.createQuery(jsql);
				Student1 s2=(Student1)qu.getSingleResult();
				System.out.println("Record Selected ID : "+id1+"");
				System.out.println("Student Name is :"+s2.getName());
				em.getTransaction().commit();
				System.out.println();	
				
			}
			
		 }while(true);
		
	}

}
