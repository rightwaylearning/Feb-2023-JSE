package paramerised_constructor;

public class Test_Controller {
	public static void main(String[] args) {
		Test t = new Test();
		Test test = new Test(23, "sayali");

		// set name with using setter method for single property
		t.setName("yogesh");
		
		// get name with getter method for single property
		String name = t.getName();
		System.out.println(name);

		
		String name1 = test.getName();
		System.out.println(name1);
	}

}
