package else_if_example;

public class printer {

	public static void print(ClassRoom cr) {
		System.out.println(">>>>>>>>>>>>");
		System.out.println("recommanded class =" + cr.getClassRoom());
		System.out.println("age gruop =" + cr.getLowerAge() + " <= your age  > " + cr.getUpperAge());
		System.out.println("annual fees = " + cr.getFees());

	}

}
