package com.prowings.one_to_many_bi;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestOneToManyBidirectionalAssociation {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee("RAM",10000,new HashSet<>());
		
		Set<Account> setOfAcc = new HashSet<>();
		
		Account account1 = new Account("Savings",1234,employee);

		Account account2 = new Account("Dmat",2222,employee);

		Account account3 = new Account("Salary",1236,employee);
		
		
		setOfAcc.add(account1);
		setOfAcc.add(account2);
		setOfAcc.add(account3);
		
//		Employee employee = new Employee();
//		employee.setName("Ram");
//		employee.setSalary(1234567);
		employee.setAccount(setOfAcc);
		
		session.save(employee);
		
		transaction.commit();
		session.close();

		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();

//		session2.delete(employee);
		
		transaction2.commit();
		sessionFactory.close();
		
		

	}
	
}
