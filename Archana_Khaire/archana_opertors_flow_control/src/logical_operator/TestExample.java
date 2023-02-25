package logical_operator;

public class TestExample {
	
	public static void main(String[] args) {
		
		int s = 200;
		int t = 100;
		    //s = 201  
		if(s++ == 250 && ++t ==15) {
			System.out.println("True part");
			s++;
			t++;
		} else{
			System.out.println("False part");
		}
		
		System.out.println(s);
		System.out.println(t);
	}

}
