package com.Array;

public class SortedArrey {

	public static void main(String[] args) {

		int a [] = { 3,6,9,0,1,3,8,2 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) //3>0/3>1/3>2
				{
				temp=a[i];//temp = 3/temp=3/temp=3
				a[i]=a[j]; // a[i]=0/a[i]=1/a[i]=2
				a[j]=temp; // a[j]=3/a[j]=3/a[j]=3
				//{0,1,2,3,6,9,3,8}
				//{}
				}//if close
			}//for j close
		}//for i close
		for (int i : a) {
			System.out.print(i + ",");
		}
	
	System.out.println("\n");
	String s = "sky is blue";	
	// Using split function.
	for (String val: s.split(" ", 2))
    {
		// printing the final value.
		System.out.println(val);
    }
// Driver Code

	// Sample string to check the code
	
	
	// function calling

}
}
