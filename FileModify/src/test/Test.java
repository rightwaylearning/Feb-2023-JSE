package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		File folder = new File("D:\\java_program");
		for (String string : folder.list()) {
			System.out.println(string);
			File fileToBeModified = new File(folder, string);
			if(fileToBeModified.isFile()) {
				 StringBuilder oldContent = new StringBuilder();
				    try (BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified))) {
				        String line = reader.readLine();
				        while (line != null) {
				            oldContent.append(Test123.toUpperCaseWorld(line)).append(System.lineSeparator());
				            line = reader.readLine();
				        }
				        String content = oldContent.toString();
				        try (FileWriter writer = new FileWriter(fileToBeModified,true)) {
				            writer.write(content);
				        }
				    } catch (IOException e) {
				        e.printStackTrace();
				    }
				
			}
		}		
		//File fileToBeModified = new File("D:\\java_program\\test.txt");
	   
	}
}
