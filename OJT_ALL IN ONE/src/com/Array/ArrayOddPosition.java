package com.Array;

public class ArrayOddPosition {

	public static void main(String[] args) {

		int a[] ={1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < a.length; i=i+2) 
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i]);
			}
		}
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i] + " ");
			}
		}
		System.out.println("\n find the even num with thier index");;
		
		int b[] ={5,8,4,6,7,9,10,15,12,13,19,17};
		
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i] % 2 == 0)
			{
				System.out.println(b[i] + " at " + i);
			}
		}
		
		System.out.println("Sorting OF array");
		for(int i =0 ; i<b.length;i++)
		{
			int temp = 0;
			for(int j = i+1; j<b.length;j++)
			{
				if(b[i]>b[j])
				{
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				}
			}
			System.out.print(b[i] + " ");
		}
		System.out.println("\nSmall element of arrey= " + b[0]);
		System.out.println("highest element of arrey= " + b[b.length-1]);
		System.out.println("2nd highest element of arrey= " + b[b.length-2]);
	}
}
