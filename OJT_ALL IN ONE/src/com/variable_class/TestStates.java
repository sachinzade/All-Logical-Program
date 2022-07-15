
package com.variable_class;

public class TestStates 
{

	public static void main(String[] args) 
	{
		
		State mh = new State("Maharashtra", "Mumbai", 36);
		
		System.out.println(mh.capitalName + " " + mh.noOfDistricts +" " + mh.stateName );
		
		String data = mh.toString();
		System.out.println(data);
		System.out.println(mh.toString());// toString is called automatically
		System.out.println(State.country);
		
		State up = new State("Utter Pradesh", "Lucknow", 72);
		System.out.println(up);// toString is called automatically
		System.out.println(up.capitalName);
		String data1 = up.toString();// Non-static method and Non-static variable are called using object name / object reference
		System.out.println(data1);
		System.out.println(State.country);
		State.display();// static method and static variable are called using class name.
	}
}
