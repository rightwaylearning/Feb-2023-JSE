package else_if_example;

public class Printer {
	public void print(ClassRoom cr) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<,");
		System.out.println("recommanded class= " + cr.getClassroom());
		System.out.println("age group= " + cr.getLowerAge() + "<=your kid age>" + cr.getUpperAge());
		System.out.println("Annual Fees=" + cr.getFees());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
