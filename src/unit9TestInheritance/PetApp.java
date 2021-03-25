package unit9TestInheritance;

public class PetApp {
	
	public static void main(String[] args) {
		
		Pet pet = new Pet("Abe", "ardvark");
		
		String theSpecies = pet.getSpecies();
		String theName = pet.getName();
		
		System.out.println("pet the manual way:  " + theSpecies + ", " + theName);
		
		System.out.println("and the toString way:  " + pet.toString());
		
		
	}
	

}
