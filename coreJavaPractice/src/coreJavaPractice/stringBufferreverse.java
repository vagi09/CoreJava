package coreJavaPractice;

import java.util.Scanner;

public class stringBufferreverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String to reverse: ");
		String str = scan.nextLine();
		
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());

		
	}

}
