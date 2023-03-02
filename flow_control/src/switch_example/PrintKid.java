package switch_example;

public class PrintKid {

	public static void Admission(School s1) {
		
		if (s1 != null) {
			
			System.out.println(".........Get Your Child Admission in Class........");
			
			System.out.println("get Admission in Class = "+ s1.getClassRoom());
			System.out.println("Age Group Between(in months) = "+s1.getLowerAge()+ "to" + s1.getUpperAge());
			System.out.println("Pay fees and confirm your Child Admission = "+ s1.getFees());
			
		}else {
			System.out.println("sorry..parents your child is not eligible");
		}
		
	}
}
