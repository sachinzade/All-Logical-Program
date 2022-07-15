package com.variable_class;
/* 
class variables are accessed using class name
object variables are accessed using object name/object reference.

* */
public class Account { 
	int accno,balance;// object variable / instance variable
	static String bankname = "SBI";// static variable / class variable
	
	// static variable has same value for all objects

	// constructor is used to initialize instance variables.
	/*public Account(int a , int b ) 
	{
		accno= a;
		balance=b;	
	}
	*/
	public Account(int accno, int balance) 
	{
		super();
		this.accno=accno;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + "]";
	}	// toString() gives object's contents ( object's data / object's state)  

	 
	void deposite (int amount)
	{
		balance = balance+amount;
	}// return type of deposit(int amount) is void means it will not return any value .

	
	int withdraw(int amount)
	{
		if( balance-amount >= 500)
		{
			balance=balance-amount;
			
		}else {
			System.out.println("Insufficient Balance in Ac. No. " + accno);
		}
		return balance;
	}// return type of withdraw(int amount) is int means it will return int value .


}
