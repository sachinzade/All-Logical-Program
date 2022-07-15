package com.variable_class;

public class State 
{

	String stateName, capitalName;
	int noOfDistricts;
	
	static String country = "India";// static variable has same value for all objects
	
	// constructor is used to initialize instance variables / object varibales.

	public State(String s, String c, int n) 
	{
		stateName=s;
		capitalName=c;
		noOfDistricts=n;
	}//constructor ends

	/*public State(String stateName, String capitalName, int noOfDistricts) {
		super();
		this.stateName=stateName;
		this.capitalName=capitalName;
		this.noOfDistricts=noOfDistricts;
	}*/
	
	@Override
	public String toString() {
		return "stateName=" + stateName + ", capitalName=" + capitalName + ", noOfDistricts=" + noOfDistricts;
	}// tostring end
	
	// static method has same output for all objects and it is called using className
	
	static void display()
	{
		System.out.println(State.country);
	}//display ends
	// static variable is called using class name . all states have same country name i.e. India. 
	//Hence country is static variable/class variable
}
