package oopsconcepts;

public class OverLoading {

	public static void main(String[] args) {

		SayHi();
		SayHi("Vageesha");
		SayHi("Jajur");
		SayHi("Welcome to Java");

	}

	public static void SayHi() {

		System.out.println("Hi");
	}

	public static void SayHi(String name) {

		System.out.println("Hi " + name);
	}

}

// writing the same method with different paarameters