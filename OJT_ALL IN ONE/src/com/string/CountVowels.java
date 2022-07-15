package com.string;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		System.out.println("To find the Vowels Enter the sentence :\n");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		
		for (char c : s.toCharArray()) 
		{
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
			{
				count++;
			}// if Ends
			
		}// for ends
		
		System.out.println("In " + "'" + s + "'" + " there are " + count + " Vowels");
	}
}
