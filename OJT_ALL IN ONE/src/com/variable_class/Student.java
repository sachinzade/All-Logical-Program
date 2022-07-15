package com.variable_class;

public class Student {
	/*

	class is a template or blueprint using which objects are produced;
	object is an instance of a class
	class conatains variables and methods . object also contains variables and methods

	object variables should be accessed by object name
	class variables should be accessed by class name

	object variables/instance variables/non-static variables e.g. rno & marks
	class variables/static variables - e.g. subName .

	variable which has same value for all objects is static variable e.g. for all student object , subName
	is same i.e. java

	methods are of 2 type:-
	1) instance method/object method/non-static method :- it's output is different for different object . e.g. show()
	2) static method/class method :- it's output is same for all objects. e.g.display()

	final variable value can't be changed . It is constant .

	constructor is a special method . it has same name as class name . It does not have any return type .
	it's purpose is to initialize object variables

	constructor construct object . hence it is called constructor.
	 
	 */
	
	int rno, marks;
	public final static String subName = "java";
	
	public Student(int r, int m) 
	{
		rno = r;
		marks = m;
	}
	void show ()
	{
		System.out.println(rno + " " + marks);
	}//show ends
	
	static void display()
	{
		System.out.println(Student.subName);
	}

}
