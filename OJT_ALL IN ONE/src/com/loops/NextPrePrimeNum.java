package com.loops;

import java.util.Scanner;

public class NextPrePrimeNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Emter a Number :");
		int n = sc.nextInt();
		int nextPrime = 0, previousPrime = 0;// use to store values
		nextPrime = n;
		previousPrime = n;

		boolean isPrime = false;// default value

		while (!isPrime) 
		{
			isPrime = true;// check if its true then get terminated
			nextPrime++;
			previousPrime--;
			for (int i = 2; i <= nextPrime / 2; i++) {
				if (nextPrime % i == 0) {
					isPrime = false;
					break;
					// if get 0 then it goes to again in while loop and get increment
				}//1st if ends
			}//for ends
			if (isPrime) {
				System.out.println("Next Prime Number is : " + nextPrime);
				System.out.println("previous Prime Number is : " + previousPrime);
			}//2nd if ends
		}// while ends
		sc.close();
	}
}
