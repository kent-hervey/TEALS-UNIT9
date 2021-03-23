package aPProgressCheck;

public class Herbivore extends Animal {

	public Herbivore(String species, String name) {
		super("herbivore", species, name);
		
	}

	@Override
	public String toString() {
		return "[inside Herbivore ]" + super.toString();
	}
	
	

}
