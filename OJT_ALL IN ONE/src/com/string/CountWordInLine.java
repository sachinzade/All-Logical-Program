package com.string;

public class CountWordInLine {

	public static void main(String[] args) {

		String str="My Name Is Sachin Sharadrao zade";
		
		int count = 1;
		for (int i = 0; i < str.length(); i++) 
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
			{
				count++;
			}
		}
		System.out.println("No Of word in string : " + count + "\n ");
	}
}