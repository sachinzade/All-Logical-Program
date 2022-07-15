package com.loops;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		///n=123
		int temp, rev= 0 ;
		
		while(n>0)//12>0=true,,,1>0=true,,0>0=false
		{
			temp = n % 10;//123%10=3,,12%10=2,,1%10=1
			rev = rev * 10 + temp;//0*10+3=3,,3*10+2=32..32*10+1='321'
			n = n / 10;// 123/10=12,,12/10=1,,1/10=0
		}//while close
		System.out.println(rev);
	}

}
