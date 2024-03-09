package com.prowings.one_to_many_bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Acc_id")
	private int id;
	@Column
	private int accountNumber;
	@Column
	private String accountName;
	@ManyToOne
	private Employee employee;
	
	public Account() {
		super();
	}

public Account(String accountName ,int accountNumber, Employee employee ) {
	super();
	this.accountName = accountName;
	this.accountNumber = accountNumber;
	this.employee = employee;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public Employee getEmployee() {
return employee;
}

public void setEmployee(Employee employee) {
this.employee = employee;
}
}	

