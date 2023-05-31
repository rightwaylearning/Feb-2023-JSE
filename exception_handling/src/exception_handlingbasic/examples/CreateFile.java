package exception_handlingbasic.examples;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateFile {

	public static void main(String[] args) {
		
		
		File f= new File("resume.txt");
		//try {
		  f.createNewFile();
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		
		Connection con = DriverManager.getConnection("","","");
		
		// Unhandled exception type SQLException
	}
}
