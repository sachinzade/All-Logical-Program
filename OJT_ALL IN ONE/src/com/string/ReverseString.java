package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		String s = sc.nextLine();
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse of String:\n" + rev);
		
		System.out.println("-----------------------");
		
		String string = "SACHIN";
		
		for(int i = string.length()-1; i >= 0; i--)
		{
			System.out.print(string.charAt(i));
		}
		System.out.println("\n-----------------------");

		StringBuffer sb = new StringBuffer("StringBuffer");
		System.out.println(sb.codePointAt(1));//gives ascii value of that character
		System.out.println(sb.reverse());
		
		System.out.println("\n-----------------------");
		
		StringBuilder sbl = new StringBuilder("StringBuilder");
		System.out.println(sbl.codePointAt(1));//gives ascii value of that character
		System.out.println(sbl.reverse());
	
	}

}
