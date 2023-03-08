package switch_case.example;
//in switch case duplicate label is not allowed .
//in switch case label should be compile time  constant 
//label value should be in rang of switch argument

public class Example1 {
	public static void main(String[] args) {

		final int a = 10;
		
		// a=60; not allowed
		 

		switch (a) {
		case a: {

		}
		case 10+10: {

		}
		case 30: {

		}
		case 40: {

		}
		}

	}

}
