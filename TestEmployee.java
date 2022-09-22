package com.exercises.pll;

import com.exercises.bll.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Aryan","Raj",25000);
		
		System.out.println(e1.toString());
		//Total Annual Salary
		System.out.println("Annual Salary= "+e1.getAnnualSalary());
		//After raise Salary
		System.out.println("new Salary= "+e1.raiseSalary(10));

	}

}
