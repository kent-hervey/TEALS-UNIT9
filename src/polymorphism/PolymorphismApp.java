package polymorphism;

import java.util.ArrayList;

public class PolymorphismApp {

	public static void main(String[] args) {
		

		
		//Example 1
		Entertainer fred = new Entertainer ("musician");
		System.out.println("Fred's talent: " + fred.getTalent());
		//does not complile System.out.println(fred.tellJoke());
		
		
		//Example 2
		ArrayList<String> oneliners = new ArrayList<String>();
		
		oneliners.add("The one about the rabbit");
		oneliners.add("The one about the lake");
		oneliners.add("A man walks into a tree");
		
		Entertainer sally = new Comedian("satire", oneliners);
		
		String theTalent = sally.getTalent();
		System.out.println(theTalent);
		System.out.println(sally.getTalent());
		
		String sallyJoke = ((Comedian)sally).tellJoke();
		System.out.println("Here is Sally's joke:  " + sallyJoke);
		//End Example 2
		
		//Example 3
		Parent obj = new Child();
		obj.display1();
		obj.display2();
	}
	
	/*
	Take Aways...
	>>At compile time, methods in or inherited by the declared type [aka reference type] 
			determines the correctness of a non-static method call
	>>At run-time, the method in the actual [aka run, object] type is executed for a non-static method call
	 */
	
	
}
