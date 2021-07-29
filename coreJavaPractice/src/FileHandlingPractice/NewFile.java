package FileHandlingPractice;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException {
		
		File newFile = new File("D:\\\\vagi3.txt");
		
		newFile.createNewFile();

	}

}
