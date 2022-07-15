package com.variable_class;

/**
 * @author hp
 *
 */
public class Employee1 
{
	int eno,salary;

	public Employee1(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [eno=" + eno + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Employee1(1, 1000));
		
		final Employee1 e1 = new Employee1(2, 2000);
		System.out.println(e1);
		
		
	}
}
