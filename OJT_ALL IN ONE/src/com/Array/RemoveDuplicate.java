package com.Array;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int [] a = {1,1,2,2,3,4,5,6,7,7,8,8};
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					a[j] = 0;
					count++;
				}//if ends
			}//2nd for ends
		}//1st for ends
		for (int i : a) 
		{
			System.out.print(i+" ");
		}//for each ends
		System.out.println("\nTotal Duplicates are : " + count);
	}

}
