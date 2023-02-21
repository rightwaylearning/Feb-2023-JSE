package conditional.opt;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 200,b =500,c = 8000;
		
		int r = (a>b && a>c)? a:(b>a && b>c)?b:c;
		System.out.println("Big element is "+r);
		
		 //int s = 512, t = 230;
		 //int r1 = (s>t && t>s)? a:b;
		
		 //System.out.println(r1);
		
	}

}


