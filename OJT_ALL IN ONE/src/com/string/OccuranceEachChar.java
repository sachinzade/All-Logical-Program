package com.string;

import java.util.HashMap;

public class OccuranceEachChar {

	public static void main(String[] args) {
		
		String str = "ssaccOOddZZkeE";
		
		char [] strArr = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < strArr.length; i++)
		{
			if(map.get( strArr[i] )== null)
			{
				map.put( strArr[i], 1 );
			}else
			{
				int count = map.get(strArr[i]);
				map.put( strArr[i], ++count );
			}
		}
		System.out.println(map);
	}

}
