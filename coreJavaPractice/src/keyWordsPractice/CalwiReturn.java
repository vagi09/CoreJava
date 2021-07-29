package keyWordsPractice;

import java.util.Scanner;

public class CalwiReturn {

	public static int calre() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers to add one by one ( use space/Enter): ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		int sum =  a +  b;
		return sum;
		
			
	}

	public static void main(String[] args) {

//		int result = calre();

		System.out.println("Sum of two numbers: " + calre());

	}

}
