package unit9TestInheritance;

public class Puppy extends Dog{
	public Puppy(String name, String species, String breed) {
		super(name, species, breed);
	}
	
	@Override
	public String speak() {
		return "squeak squeak";
	}
	
	public String toString() {
		return this.getName() + " is a baby " + this.getSpecies() + " of breed " + this.getBreed();
	}
	
	

}
