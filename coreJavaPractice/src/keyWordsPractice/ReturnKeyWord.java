package keyWordsPractice;

import java.util.Scanner;

public class ReturnKeyWord {

	public static int returnNumber() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee ID to return: ");
		int empId = scan.nextInt();
		scan.close();
		
		return empId;

	}

	public static void main(String[] args) {

//		int eID = returnNumber();
		System.out.println("The ID of the Employee returned is: " + returnNumber());

	}

}
