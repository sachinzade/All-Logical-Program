package com.string;


public class SortingString {

	public static void main(String[] args) {

		String str = "zoahcecl19iwAZlwgts";
		
		char temp;
		char charArray[] = str.toCharArray();
		 for(int i = 0; i < charArray.length; i++ ) 
		 {
	         for(int j = i+1; j <charArray.length; j++) 
	         {
				if (charArray[i] > charArray[j]) 
				{
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
	         }
	      }
		for (char i : charArray) 
		{
			System.out.print(i + " ");
		}
	}
}
