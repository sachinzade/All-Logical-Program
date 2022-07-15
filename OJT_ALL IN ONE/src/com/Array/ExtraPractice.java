package com.Array;

public class ExtraPractice {

	public static void main(String[] args) {

		int []a = {0,1,2,0,0,8,0,9,0,5,0,4,3};
		int count = 0; 
		for(int i = 0; i < a.length; i++ )
		{
			if(a[i] != 0)
			{
				a[count++] = a[i];
			}
		}
		while(count < a.length)
		{
			a[count++]=0;
		}
		for(int s : a)
		{
			System.out.print(s + " ");
		}
	}

}
