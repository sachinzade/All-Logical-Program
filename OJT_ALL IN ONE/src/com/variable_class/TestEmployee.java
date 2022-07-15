package com.variable_class;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, 90);
		Employee e2 = new Employee(2, 80);
		
		System.out.println(e1.eno);
		System.out.println(e2.eno);
		
		e1.show();
		e2.show();
		
		System.out.println(Employee.companyName);
		
		Employee.companyName="Google";
		System.out.println(Employee.companyName);
	}

}
