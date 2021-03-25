package unit9TestInheritance;

public class PetApp {
	
	public static void main(String[] args) {
		
		//Testing Pet
		Pet pet = new Pet("Abe", "ardvark");
		
		String theSpecies = pet.getSpecies();
		String theName = pet.getName();
		
		System.out.println("pet the manual way:  " + theSpecies + ", " + theName);
		
		System.out.println("and the toString way:  " + pet.toString());
		
		//Testing Dog
		Pet dog = new Dog("Charlie", "dog", "Husky");
		// for testing case where reference Type is run type
		Dog dog2 = new Dog("Doug", "dog", "Husky");
		
		String theSpeciesDog = dog.getSpecies();
		String theNameDog = dog.getName();

		System.out.println("pet the manual way:  " + theSpeciesDog + ", " + theNameDog);
		System.out.println("It seems that dog object can't give a breed because its Reference/Declared type is Pet which has no getBreed method");
		System.out.println("   However, downcasting makes it work:  String theBreed = ((Dog) dog).getBreed()");
		
		System.out.println("Info on dog2 (declared type and run type both Dog) using toString:  " + dog2.toString());	
		System.out.println("What does the dog say?  \n\t" + dog2.speak());
	}
}
