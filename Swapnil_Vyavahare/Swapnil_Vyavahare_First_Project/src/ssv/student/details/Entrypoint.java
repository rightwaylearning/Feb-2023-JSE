package ssv.student.details;

public class Entrypoint {
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		s1.studentName="Swapnil";
		s1.schoolName="Sp";
		s1.studentAge=23;
		s1.studentInfo();
		
		
//		char ch[]= {'s','w','a','p','n','i','l'};
//		System.out.println(ch);
		
		String s = "Swapnil";
		s.charAt(2);
		s.codePointAt(1);
		System.out.println(s.codePointAt(1));
		System.out.println(s.startsWith(s));
	}

}
