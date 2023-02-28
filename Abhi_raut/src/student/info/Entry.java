package student.info;

public class Entry {
	public static void main(String[] args) {
		Output o = new Output();
		
		Student s = new Student();
		
		s.setRollNumber(15);
		s.setName("samuals badree");
		s.setMarks(o.getmarks());
		s.setSchool(o.getSchoolinfo());
		s.setAddress(o.getAddressinfo());
		
		o.printEntry(s);
	}

}
