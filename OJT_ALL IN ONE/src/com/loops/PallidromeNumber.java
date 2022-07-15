package com.loops;

import java.util.Scanner;

public class PallidromeNumber {

	public static void main(String[] args) {
		
		/*palindrom number --> 
		 A palindromic number is a number that remains the same when its digits are reversed*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number: ");
		int n = sc.nextInt();

		int rem, sum = 0;
		int temp = n;   // hold the number temporary in the veriables

		while (n > 0) 
		{
			rem = n % 10; // 121%10=1,,12%10=2,,,1%10=1
			sum = sum * 10 + rem;
			n = n / 10;   //  123/10=12,,12/10=1,,,1/10=0
		}
		if (temp == sum)
			System.out.println(temp + " is Pallidrome number");
		else
			System.out.println(temp + " is not a pallidrome number");
		
		sc.close();
	}
}
