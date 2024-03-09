
	package com.prowings.one_to_one_bi;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	import com.prowings.dao.HibernateUtil;

	public class TestOneToOneBidirectionalAssociation {
		
		public static void main(String[] args) {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			Employee employee = new Employee();
			
			employee.setName("Ram");
			employee.setSalary(1234567);
			
			
			Account account = new Account();
			account.setAccountName("Savings");
			account.setAccountNumber(1111);
			
			employee.setAccount(account);
//			account.setEmployee(employee);
			
//			session.save(employee);
//			session.save(account);
			transaction.commit();
			session.close();
			
			int accId = account.getId();
			int empId = employee.getId();
			
			Session session2 = sessionFactory.openSession();
			Transaction transaction2 = session2.beginTransaction();
			
//			Employee retrievedEmp = session2.get(Employee.class, empId);
//			
//			System.out.println(retrievedEmp.getId());
//			System.out.println(retrievedEmp.getName());
//			System.out.println(retrievedEmp.getSalary());
//			System.out.println(retrievedEmp.getAccount().getAccountNumber());
//			
//			Account retrievedAcc = session2.get(Account.class, accId);
//			System.out.println(retrievedAcc.getId());
//			System.out.println(retrievedAcc.getAccountName());
//			System.out.println(retrievedAcc.getAccountNumber());
//			System.out.println(retrievedAcc.getEmployee().getName());
			
			transaction2.commit();
			session2.close();
			
			sessionFactory.close();

		}

	}
