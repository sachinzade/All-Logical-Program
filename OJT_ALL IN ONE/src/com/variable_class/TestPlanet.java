package com.variable_class;

public class TestPlanet 
{

	public static void main(String[] args)
	{
		Planet p1 = new Planet(01, "Earth");
		p1.show();

		Planet p2 = new Planet(02, "Saturn");
		p2.show();

		Planet p3 = new Planet(02, "Mars");
		p3.show();

		Planet p4 = new Planet(02, "Neptune");
		p4.show();

		Planet p5 = new Planet(02, "BahuBali 2");
		p5.show();
		
		System.out.println("Our Planetary System is a part of -> " + Planet.galaxyName);
	}

}
