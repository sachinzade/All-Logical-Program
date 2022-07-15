package com.variable_class;

public class TestStudent 
{

	public static void main(String[] args)
	{
		Student abhi = new Student(1,90);
		Student jaydeep = new Student(2,80);
		
		System.out.println(abhi.marks);
		System.out.println(jaydeep.marks);
		
		abhi.show();
		jaydeep.show();
		
		Student.display();
		System.out.println(abhi.marks);
		
		
	}

}
