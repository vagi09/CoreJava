package calculatorpractice;

import java.util.Scanner;

public class calculator implements JavaInterface { // implementing interface

	@Override
	public void add() {

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Two numbers for addition: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a + b;
		System.out.println("The addition of " + a + " and " + b + " is " + s);

	}

	@Override
	public void sub() {

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Two numbers for substraction: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a - b;
		System.out.println("The substraction of " + a + " and " + b + " is " + s);

	}

	@Override
	public void mul() {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Two numbers for multiplication: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a * b;
		System.out.println("The multiplication of " + a + " and " + b + " is " + s);

	}

	@Override
	public void div() {

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Two numbers for division: ");
		double a = kb.nextInt();
		double b = kb.nextInt();
		double s = a / b;
		System.out.println("The division of " + a + " and " + b + " is " + s);

	}

	@Override
	public void comp() {

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter Two numbers for comparison: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		if (a > b) {
			System.out.println(a + "  greater than " + b);
		}

		else if (a < b) {
			System.out.println(" a is less than b");

		}

		else {

			System.out.println(" Both are equal");
		}

	}

}
