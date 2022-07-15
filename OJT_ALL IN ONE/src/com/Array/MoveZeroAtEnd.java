package com.Array;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		int[] arr = { 9, 0, 2, 0, 30, 1, 0, 5, 0, 5, 0, 6, 7 };

		for(int ar : arr)
		{
			System.out.print(ar + " ");
		}
		int count = 0;// use to count the non zero element of array
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] != 0) 
			{
				arr[count++] = arr[i];
				// Shifting all the non zero elements of array and counting it
			}
		}
		System.out.println("\nSize of non-Zero : " + count);//counting non-zero numbers
		while (count < arr.length) 
		{
			arr[count++] = 0;
			// we set 0 after the non zero element of array
		}
		for(int arrs : arr)
		{
			System.out.print(arrs + " ");
		}
		
		System.out.println("\n reversr of array \n ");
		
		int a[] = {1,2,3,4,5};
		int rev[] = new int [a.length];

		for(int i =0 , j = a.length - 1; j >= 0 ; i++,j--)
		{
		rev[j] = a[i];
		}

		for(int r : rev)
		{
		System.out.print(r + " ");
		}
	}

}
