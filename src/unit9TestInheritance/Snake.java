package unit9TestInheritance;

/**
 * Represents a snake, which is a pet.
 */
public class Snake extends Pet {

	private String length;
	private String color;

	// Write a constructor that creates a snake with the given name, species,
	// length, and color.
	public Snake(String n, String length, String color) {
		super(n, "snake");
		this.length = length;
		this.color = color;
	}

	// Write a method that returns this snake's length
	public String getLength() {
		return this.length;
	}

	// Write a method that returns this snake's color
	public String getColor() {
		return this.color;
	}

	// Returns a string representation of this snake. The string should have the
	// following format: <snakes’ name> " is a " <species> " that is " <color> " and
	// " <length> " inches long"
	public String toString() {
		return super.toString() + " that is " + this.color + " and " + this.length + " inches long";
	}

	// Returns a string indicating what this snake says
	public String speak() {
		return "hiss hiss";
	}

}
