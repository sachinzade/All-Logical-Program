package com.loops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int temp = 0;
		for(int i = 0; i <= 50; i++)
		{
			int count = 0;
		for(int j = 2; j < i; j++)
		{
			if(i % j == 0)
			{
				count++;
				break;
			}//if ends
		}//2nd for ends
		if(count==0)
		{
			System.out.println(i + " prime Number");
			temp++;
		}//if ends
	    }//1st for ends 
		System.out.println("\nTotal prime numbers are " + temp);
	}

}
