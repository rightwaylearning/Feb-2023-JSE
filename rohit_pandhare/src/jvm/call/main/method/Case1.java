package jvm.call.main.method;

public class Case1 {
	
	public static int main1(){
		
		int a = 11;
		System.out.println("first this value"+a);
		return 10;
	
//		return kelili value jvm capture karel na aaplyala thodi
//				bhetel re tya mule aaplya la bhetnya sathi void kartoh
	}

	public static void main(String[] args) {
		
		int a1= main1();
//		System.out.println(Case1.main1());
		System.out.println(a1);
		
	}
	
	
}
