package com.loops;

public class SwappingNumbers 
{

	public static void main(String[] args) 
	{

		int a = 12, b = 14;
		
		System.out.println("Before Swapping --> ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a = a+b;// 12+14=26 now a = 26
		b = a-b;// 26-14=12 -> b = 12
		a = a-b;// 26-12=14 -> a = 14
		
		System.out.println("\nAfter Swapping --> ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}

}
