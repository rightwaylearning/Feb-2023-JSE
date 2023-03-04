package info.about.classroom;

public class EntryPoint2Switch {

	
	public static void main(String[] args) {
		
		Advice2Switch a = new Advice2Switch();

		String str = Advice2Switch.m1(61);
		
//		System.out.println(str);
		
		ClassRoom cr = a.m2(str);
		
		PrintData.print(cr);
		
	}
}
