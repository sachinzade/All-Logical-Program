package com.Array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int []arr1 = {1,2,3,4,5};
		int []arr2 = {6,1,2,3,4,5,7,8,9,0};
		int[]result = new int [arr1.length+arr2.length];
		int count = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			result[i]=arr1[i];
			count++;
		}
		for (int j = 0; j < arr2.length; j++) {
			result[count++] = arr2[j];
		}
		for(int a : result)
		{
			System.out.print(a + " ");
		}
		System.out.println("-----------------------------------\n");
		System.out.println(Arrays.toString(result));
	}

}
