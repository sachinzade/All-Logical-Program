package com.Array;

public class DuplicateArray {

	public static void main(String[] args) {

		int a[]  = {1,1,2,2,3,4,5,6,7,7,8,8};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					System.out.print(a[i]+ " ");
				}
			}
		}
	}

}
