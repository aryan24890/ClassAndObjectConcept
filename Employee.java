package com.exercises.bll;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	
	//parameterized constructor
	public Employee(int id, String firstName, String lastName, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getName() {
		return firstName+lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getAnnualSalary() {
		return salary*12;
	}
	
	public double raiseSalary(int percent) {
		return salary+(getSalary()*percent)/100;
	}
	
	public String toString() {
		return "Employee [id= "+id+",Name="+firstName+" "+lastName+", Salary="+salary+"]";
	}

}
