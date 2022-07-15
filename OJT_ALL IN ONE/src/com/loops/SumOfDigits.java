package com.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		// int n = 555;
		int temp = 0, sum = 0;
		
		while (n > 0) 
		{
			temp = n % 10;
			sum = sum + temp;
			n = n / 10;
		}
		System.out.println("sum of number : " + sum);
	}

}
