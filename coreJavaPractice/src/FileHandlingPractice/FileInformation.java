package FileHandlingPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileInformation {

	public static void main(String[] args) throws IOException {
		// This code is for getting the file information and adding new text to the empty file

		File fileInfo = new File("D:\\Javanew.txt");
		FileWriter write = new FileWriter("D:\\vagi.txt");
		write.write(" adding some new text fot practice");
		write.close();
		

		if (fileInfo.exists()) {

			System.out.println("File Name: " + fileInfo.getName());
			System.out.println("Absoulote Path: " + fileInfo.getAbsolutePath());
			System.out.println("Writable: " + fileInfo.canWrite());
			System.out.println("Readble: " + fileInfo.canWrite());
			System.out.println("File Size in Bytes: " + fileInfo.length());
		} else {

			System.out.println("File doesn't exists");
		}
	}
}
