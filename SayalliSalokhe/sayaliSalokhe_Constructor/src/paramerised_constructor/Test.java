package paramerised_constructor;

public class Test {
	private int roll_no;
	private String name;
	
	Test(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
		System.out.println(roll_no);
		System.out.println(name);
	}
	
	Test() {
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
