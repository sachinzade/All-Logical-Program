package com.loops;

import java.util.Scanner;

public class NextPrePalindromeNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Emter a Number :");
		int n = sc.nextInt();
		int next = 0, previous = 0;
		int temp, rem = 0, sum = 0;
		next = n;
		previous= n;
		while(true) 
		{
			n++;
			temp=n;
			sum = rem =0;
			next++;
			previous--;
			while (temp > 0)
			{
			
				rem = temp % 10;
				sum = sum * 10 + rem;
				temp = temp / 10;
			}
			if (sum == n ) 
			{
				System.out.println("Next palindrome number : " + next);
				System.out.println("Previous palindrome number : " + previous);
				break;
			}
		}
	}

}
