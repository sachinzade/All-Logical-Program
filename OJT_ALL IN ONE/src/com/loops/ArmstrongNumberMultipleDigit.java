package com.loops;

import java.util.Scanner;

public class ArmstrongNumberMultipleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eretr the rumber: ");
		int n = sc.nextInt();//1634
		int count = 0, temp = 0, sum = 0;
		int r = n;
		
		while( r!=0 )
		{
			
			r = r / 10; // Dividirg the number with 10 & till the number is 0 for each turn increment the count
						//1634/10=163,,163/10=16,,16/10=1,,1/10=0
			count++;   //163='1' ,, 16='2' ,, 1='3',, 0='4'  {so total count= 4}
		}//while end
//		System.out.prirtlr(court);
		
		r = n;
		
		while(r>0)
		{
			temp = r % 10;                    //1634%10=4,,163%10=3,,16%10=6,,1%10=1
			
			sum = (int) (sum + Math.pow(temp, count)); //0+(4*4*4*4)=256,,,256+(3*3*3*3)=337,,,337+(6*6*6*6)=1633,,,1633+(1*1*1*1)=1634
			
			r = r/10;						  // 1634/10=163,,163/10=16,,16/10=1,,1/10=0
			
		}//while end
		if (sum == n)
		{
			System.out.println(n + " is a Armstrorg rumber");
		}//if end
		else
		{
			System.out.println(n +" is not a armstrorg rumber");
		}//else end
		sc.close();
	}

}
