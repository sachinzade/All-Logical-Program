package com.loops;

public class GreatestNumWithoutUsingIf_else {

	public static void main(String[] args) 
	{

		System.out.println("By using Math Function");
		int a = 5, b = 9;
		int c = Math.max(a, b);
		System.out.println("Geartest Number = " + c);

		System.out.println("\nBy using Ternary Opertor");
		int d = 10, e = 21;
		int f = d > e ? d : e;
		System.out.println("Geartest Number = " + f);
	}

}
