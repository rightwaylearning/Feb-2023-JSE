package info.about.classroom;

public class PrintData {
	
	
	public void print(ClassRoom cr) {
		if(cr != null) {
		System.out.println("Fit for this class = " +cr.getClassAllocate());
		System.out.println("Your age is fit for this =  " + cr.getLowerAge() + "<= Kid age <" +cr.getUpperAge());
		System.out.println("class fees = " + cr.getFees());
		}
		else {
			System.out.println("Sorry Bhai !!");
		}
	}

}
