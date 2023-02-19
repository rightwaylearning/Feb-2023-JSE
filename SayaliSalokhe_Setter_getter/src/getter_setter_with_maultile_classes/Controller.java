package getter_setter_with_maultile_classes;

public class Controller {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStuent_name("Sayali");
		s.setEmail("sayali123@mail.com");
		s.setStud_Phone_No(98865443219L);

		CollegeDetails c = new CollegeDetails();
		c.setClg_Name("vck college");
		c.setCourse_Name("MCA");
		c.setPrn_No(23445);

		s.setDetails(c);

		HomeAddress a = new HomeAddress();
		a.setLine1("sumeru");
		a.setLine2("hinjwadi");
		a.setPincode(564222);

		s.setHomeAddress(a);
		// ---------------------------------------------------------------------
		String stuent_name = s.getStuent_name();
		String email = s.getEmail();
		Long Phone_no = s.getStud_Phone_No();

		System.out.println("Name:" + stuent_name);
		System.out.println("Email:" + email);
		System.out.println("Phone No:" + Phone_no);

		CollegeDetails c1 = s.getDetails();
		System.out.println("College name:" + c1.getClg_Name());
		System.out.println("Course name:" + c1.getCourse_Name());
		System.out.println("PRN no:" + c1.getPrn_No());

		HomeAddress a1 = s.getHomeAddress();
		System.out.println("Address:" + a1.getLine1());
		System.out.println(a1.getLine2());
		System.out.println("Pincode:" + a1.getPincode());

	}

}
