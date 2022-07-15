package com.variable_class;

public class Employee {
	
	int eno,salary;
	public static String companyName = "Microsoft";
	
	/*public Employee(int r, int m) 
	{
		eno = r;
		salary = m;
	}*/
	public Employee(int eno , int salary) 
	{
		super();
		this.eno = eno;
		this.salary = salary;
	}//construct ends
	
	void show()
	{
		System.out.println(eno + " " + salary);
	}// show end 
}
