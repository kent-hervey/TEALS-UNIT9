package unit9TestInheritance;

public class Pet {
	private String name;
	private String species;
	
	// Creates a pet with the given name and species
	public Pet(String n, String s)
	{
	    name = n;
	    species = s;
	}
	
	// Returns this pet's name
	public String getName()
	{
	    return name;
	}

	// Returns this pet's species
	public String getSpecies()
	{
	     return species;
	}
	
	// Returns a string representation of this pet
	public String toString()
	{
	    return  name + "  is a  " + species;
	}
	
	// This method should return a string indicating what this pet says
	public String speak()
	{
	     return "I am a generic pet,  I don't speak uniquely";
	}

}
