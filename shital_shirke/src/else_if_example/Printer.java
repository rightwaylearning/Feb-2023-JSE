package else_if_example;

public class Printer {

	public static void print(ClassRoom cr) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		if (cr != null) {
			System.out.println("recommended class  = " + cr.getClassRoom());
			System.out.println("age group = " + cr.getLowerAge() + " <= your kid age >" + cr.getUperAge());
			System.out.println("Annual Fees = " + cr.getFees());
		}else {
			System.out.println("sorry parents , your kid age is not matched");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	}
	}



