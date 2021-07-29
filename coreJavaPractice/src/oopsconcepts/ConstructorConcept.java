package oopsconcepts;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		
		System.out.println("This is Default Construtor"); // Default Construtor
	}

public ConstructorConcept(int i ) {
		
		System.out.println("This is single parameter Construtor"); // Single parameter Construtor
		System.out.println("The Value of i: " + i);
		
	}
	
public ConstructorConcept(int i, int j ) {
	
	System.out.println("This is two parameter Construtor"); //Double Parameter Construtor
	System.out.println("The Value of i: " + i);
	System.out.println("The Value of j: " + j);
		
}

public static void main(String[] args) {
	
	ConstructorConcept obj = new ConstructorConcept(); // o/p: This returns Default Construtor
	ConstructorConcept obj1 = new ConstructorConcept(100); // O/P: Returns Single parameter
	ConstructorConcept obj2 = new ConstructorConcept(10, 5); // O/P: Returns double parameter
	
	
}

}
