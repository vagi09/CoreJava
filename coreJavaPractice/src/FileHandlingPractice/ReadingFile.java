package FileHandlingPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This is for reading the file contents from existing file 

public class ReadingFile {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/VAGI/eclipse-workspace/coreJavaPractice/src/filehandling");

		Scanner scan = new Scanner(file);

		System.out.println(scan.nextLine()); // o/p: Reads the first line of the Java.text file

		while (scan.hasNextLine()) {

			System.out.println(scan.nextLine()); // o/p reads the whole text in the file

		}

	}

}
