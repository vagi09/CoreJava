package coreJavaPractice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in); // create an object of scanner class
		 * 
		 * System.out.println("Enter the String to reverse: "); // i/p for string String
		 * str = scan.nextLine(); //store the i/p in str variable String reverse = "";
		 * //blind string for reversed string
		 * 
		 * /*int len = str.length(); for(int i = len-1; i >= 0; i--)
		 */

		// or

		/*
		 * for(int i = str.length() - 1; i >= 0; i--) // for loop { reverse = reverse +
		 * str.charAt(i); }
		 * 
		 * System.out.println("Reversed string is:"); System.out.println(reverse);
		 * System.out.println("Reversed String in upper Case: " +
		 * reverse.toUpperCase());
		 * System.out.println("The length of Entered String is: " + reverse.length());
		 */

		String myStr = "What goes around comes around";
		System.out.println(myStr.charAt(5)); //g
		System.out.println(myStr.indexOf("t")); //3
		System.out.println(myStr.toUpperCase());//WHAT GOES AROUND COMES AROUND
		System.out.println(myStr.replace("What","That"));
		System.out.println("Substring starting from index 0 to 6: "+myStr.substring(0,6)); //Sachin  
		

	}

}
