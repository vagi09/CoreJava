package coreJavaPractice;

import java.util.Scanner;

public class scannerJava {

	public static void main(String[] args) {

//		int a, b;
		

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number for additon: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number for addition: ");
		int b = scan.nextInt();
		int sum = a + b;
		System.out.println("The Sum of "+ a + " and "+ b + " is " + sum);

	}

}
