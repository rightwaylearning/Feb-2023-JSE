package first_project;

import java.util.Iterator;
import java.util.Scanner;

public class StringTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String	str = "Swapnilghcgdgdhgd";
//	int num =2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String s1= sc.next();
	for (int i = 0; i < s1.length(); i++) {
		System.out.println(s1.charAt(i));
	}
	System.out.println(s1.length());
	
	}
	
	

}
