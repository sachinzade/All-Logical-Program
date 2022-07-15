package com.variable_class;

public class TestAccount {

	public static void main(String[] args) {
	 // objectReference is also called as object name
		
	 // ClassName  objectReference = new Constructor()
		Account          a1        = new   Account(1, 1000);
		
	 // a1--> [accno=1 balance=1000 deposit() withdraw() toString()] Account class object
	 // a1 is object reference or object name . it is used to access variables and methods from an object
		System.out.println(a1.toString());
		
		System.out.println(a1.accno);
	 // object variable is accessed using object reference(object name)
		
		a1.deposite(3000);
		
		System.out.println(a1);// toString() will be called here automatically
		/*int updatedBalance = a1.withdraw(5000);*/
		System.out.println("----------------------");
		a1.withdraw(3600);
		System.out.println(a1);
		
		System.out.println(Account.bankname);// static variable(class variable) is called using class name
	}

}

