package com.string;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {

		System.out.println("To find the Vowels Enter the sentence :\n");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		String g = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) 
		{
			if (g.charAt(i) == 'a' || g.charAt(i) == 'e' || g.charAt(i) == 'i' ||
					g.charAt(i) == 'o'|| g.charAt(i) == 'u') 
			{
				count++;
				System.out.println("In " + "'" + s + "'" + "contain" + s.charAt(i) + " at index " + i);
			}//if ends
		}//for ends
		System.out.println("\nThere are " + "'" + count + "'" + " Vowels in '" + s + "'");
	}

}
