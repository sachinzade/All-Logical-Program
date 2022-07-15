package com.string;

public class RemoveSpeChar {

	public static void main(String[] args) {
		System.out.println("---Remove Spacial Character----");
		
		String s = "#### Sachin **** Zade @@@@ 1234";
		System.out.println(s);
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		System.out.println("\n---Remove WhiteSpaces----");
		
		String d = "S A C H I N   Z A D E" ;
		System.out.println(d);
		d = d.replaceAll(" ", "");
		System.out.println(d);
	}

}
