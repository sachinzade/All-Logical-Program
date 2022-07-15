package com.variable_class;

public class Person 
{
	int pid;
	String pname;
	/*
	 if no constructor is written by programmer then compiler adds default constructor
	 default constructor does not have any parameter . It initializes all variables to their default values.
	 default value of int variable is 0
	 default value of String variable is null
	
	 default constructor which will be added by compiler will look like below :-
	 
	 Person()
	 {
	 	rno=0;
	 	pname=null;
	 }
	  m
	 */
	
	public static void main(String[] args) {
		
		Person obj = new Person();
		
		System.out.println(obj.pid + " " + obj.pname);
		
		obj.pid=10;
		obj.pname="Sachin";
		
		System.out.println(obj.pid + " " + obj.pname);
	}
}
