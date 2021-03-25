package unit9TestInheritance;

public class Dog extends Pet {
	private String breed;

	// Creates a dog with the given name and breed
	public Dog(String n, String s, String b) {
		super(n, s);
		this.breed = b;
	}

	// Returns this dog's breed
	public String getBreed() {
		return this.breed;
	}

	// Returns a string representation of this dog. The string should have the
	// following format: <dog’s name> " is a " <species> " of breed " <breed>
	public String toString() {
		//return this.getName() + " is a " + this.getSpecies() + " of breed " + this.breed;
		return super.toString() + " of breed " + this.breed;
	}

	// Returns a string indicating what this dog says. You may choose what your
	// dog says.
	public String speak() {
		return "roof roof";
	}

}
