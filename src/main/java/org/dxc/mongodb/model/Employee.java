package org.dxc.mongodb.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="employee")
public class Employee {
	@Id
	private int employeeid;
	private String firstname;
	private String lastname;
	private String jobtitle;
	private double salary;
	
	
	
	public Employee(int employeeid, String firstname, String lastname, String jobtitle, double salary) {
		super();
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.jobtitle = jobtitle;
		this.salary = salary;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", jobtitle=" + jobtitle + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
