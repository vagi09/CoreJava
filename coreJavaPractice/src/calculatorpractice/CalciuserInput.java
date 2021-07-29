package calculatorpractice;

import java.util.Scanner;

public class CalciuserInput {

	public static void main(String[] args) {

		char operator;
		double num1, num2;

		Scanner inPut = new Scanner(System.in);

		System.out.println("Enter the Operator (+,-.*./)");
		operator = inPut.next().charAt(0);

		System.out.println("Enter the two numbers one by one");
		num1 = inPut.nextDouble();
		num2 = inPut.nextDouble();

		inPut.close();

		switch (operator) {

		case '+':

			System.out.printf("%.2f+%.2f=%.2f", num1, num2, (num1 + num2));
			break;
		case '-':

			System.out.printf("%.2f-%.2f=%.2f", num1, num2, (num1 - num2));
			break;

		case '*':

			System.out.printf("%.2f*%.2f=%.2f", num1, num2, (num1 * num2));
			break;

		case '/':

			if (num2 != 0)

				System.out.printf("%.2f/%.2f=%.2f", num1, num2, (num1 / num2));
			else
				System.out.println("Cant divide by ZERO");
			break;

		default:

			System.out.printf("%c is an invalid operator", operator); // you can write default case at the beginning also
		}

	}

}
