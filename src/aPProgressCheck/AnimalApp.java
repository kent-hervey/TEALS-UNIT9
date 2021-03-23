package aPProgressCheck;

public class AnimalApp {

	public static void main(String[] args) {

		System.out.println("lisa is Animal/Animal, printing its toString");
		Animal lisa = new Animal("carnivore", "lion", "Lisa");
		System.out.println(lisa.toString());
		
		System.out.println("gary is Herbivore/Herbivore, printing its toString");
		Herbivore gary = new Herbivore("giraffe", "Gary");
		System.out.println(gary.toString());
		
		
		System.out.println("percy is Elephant/Elephant, printing its toString");
		Elephant percy = new Elephant("Percy", 2.0);
		System.out.println(percy.toString());
	}

}
