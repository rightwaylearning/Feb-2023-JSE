package logical_and_or_opt;

public class Case1 {
	
	public static void main(String[] args) {
		
//		ya madhe || or madhe pahile true aasel tr dusra execute
//		nahi karnar  dusra ans nahi denar
//		
//		aani and madhe && pahile false aasel tr dusra checkch
//		nahi karnar 
		
		int a = 10;
		int b = 21;
		
		if(a > b || ++a > b) {
			 a++;
		}
		else {
			++b;
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
