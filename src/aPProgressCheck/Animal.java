package aPProgressCheck;

public class Animal {
	
	private String classification;
	private String species;
	private String name;
	
	
	/**
	 * @param classification
	 * @param species
	 * @param name
	 */
	public Animal(String classification, String species, String name) {
		this.classification = classification;
		this.species = species;
		this.name = name;
		
	}
	
	public String toString() {
		String string = "";
		string = "[inside Aminal.java]" + name + " the " + species + " is a " + classification;
		return string;
	}
	
	
}
