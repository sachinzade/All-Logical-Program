package com.loops;

public class DigitToWord {

	public static void main(String[] args) {

		String[] word = { "zero", "one", "two", "three", "four", "five", "six",
							"seven", "eight", "nine", "ten" };

		int[] number = new int[10];// memory spaces is 10
		int n = 1234;//total digit = 9
			
	for(int i = 0; i < 4; i++) // we take total digit in condition
	{
		number [i] = n % 10;
		n = n / 10;
	}
	for(int j = 3; j >= 0; j--)// we take [total digit - 1] in condition
	{
		System.out.print(word [number[j]] + " ");
	}
	}

}
