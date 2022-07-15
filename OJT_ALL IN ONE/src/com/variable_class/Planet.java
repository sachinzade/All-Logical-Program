package com.variable_class;

public class Planet {
	int planetId;
	String planetName;
	public static String galaxyName = "MilkyWay";

	public Planet(int planetId, String planetName) 
	{
		super();
		this.planetId = planetId;
		this.planetName = planetName;
	}// constructor ends

	@Override
	public String toString() 
	{
		return "Planet [planetId=" + planetId + ", planetName=" + planetName + "]";
	}//toString ends

	void show() {
		if (planetName == "Earth" || planetName == "Mercury" || planetName == "Mars" || planetName == "Saturn"
				|| planetName == "Jupiter" || planetName == "Venus" || planetName == "Urenes" || planetName == "Neptune")
		{
			System.out.println(planetName + " -> Planet belongs to the our Planetary System\n");
		} // if ends
		else 
		{
			System.out.println(planetName + " -> Out of our Planetary System\n");
		} // else ends
	}// show ends

}
