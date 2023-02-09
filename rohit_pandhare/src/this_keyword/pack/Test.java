package this_keyword.pack;

public class Test {
	
	int a ;
	int b ;
	
	void m1(int b) {
//		this hai keyword ya madhe jate
//		this is reference variable pointing towards object which 
//		object ? the object which is calling that method 
	int	a= 12;
	 b = 233;
	 this.a = 323;
	 a=43;
	 a= this.a;
	 a = 23;
	 
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(this.a);
	 System.out.println(this.b);

		
	}

}
