package instance.stact.ic;

public class Testing {
	
	public static void main(String[] args) {
//		
//		static variable field la kiti time bhete check karnya sathi ex
		
//		compile time madhe complier je last variable ahe tyachich
//		value ya madhe declare karte mhnje aata s4.z hai last la aahe
//		tr haich value z la sarvana denar karan tyala static kela aahe
//		tya mule 
		
		
//		static field belongs to class 
		
		Student.z = 32;
//		hai original aahe hyala aasa lihav lagte 
		Student.z = 3244;
		
//		compiler line by line execute karte tya mule override
//		ji value karel tich value sarvana deil
		
		Student s1 = new Student();
		
		s1.a = 21;
//		s1.z = 32;
		
		Student s2 = new Student();
		s2.a =323;
//		s2.z = 32223;
		
		Student s3 = new Student();
		s3.a = 434;
//		s3.z = 76643;
		
		Student s4 = new Student();
		s4.a = 324;
//		s4.z = 5355343;
		
		Student s5 = new Student();
		s5.a = 3;
		
		
		System.out.println("aata hai " + s1.z);
		System.out.println(s2.z);
		System.out.println(s3.z);
		System.out.println(s4.z);
		System.out.println(s5.z);
		
		
		
	}

}
