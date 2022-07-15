package com.loops;

import java.util.Scanner;

public class FibonacciSeries 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		int a = 0, b = 1, c = 0;

		// System.out.print(a+" "+b+" " );

		for (int i = 0; i <= n; i++) 
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + " ");
		}
	}
}
