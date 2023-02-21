package st.upcasting.examples;

public class UpcastingDemo {
	
	public static void main(String[] args) {
		char ch ='A';
		
		double d = ch;
		System.out.println(d);
		
		short s = 1;
		byte b = s;  //type mismatch: cannot convert from short to byte
	}

}
