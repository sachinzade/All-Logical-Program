package com.Array;

public class SmallestHighestNumInArray {
	public static void main(String[] args) {
		int [] a = {10,33,21,2,16,97};
		int temp;
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] > a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}//if ends
			}//2nd for ends
		}//1st for emds
		
		System.out.println("Smallest number in array       =" + a[0]);
		System.out.println("Highest number in array        =" + a[a.length-1]);
		System.out.println("Second highest number in array =" + a[a.length-2]);
	}

}
