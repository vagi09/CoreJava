package FileHandlingPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// This code copies the  file contents from Javanew.txt by creating Javanew2.txt file

public class CopyingFileContent {

	public static void main(String[] args) throws IOException {

		File copy = new File("D:\\Javanew.txt");
		Scanner scan = new Scanner(copy);
		
		String fileContent = "";
		
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("D:\\Javanew2.txt");
		writer.write(fileContent);

		writer.close();

	}

}
