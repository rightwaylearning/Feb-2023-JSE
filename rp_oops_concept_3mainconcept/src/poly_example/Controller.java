package poly_example;

public class Controller {
	
	public static void main(String[] args) {
		
		
	 Case1 c  = new Case1();
	 
	 int a =10;
	 
//	 int la box madhe wrap karte tyala object banavte
//	 int la wrap karun box madhe tyala Object banavte
//	 c.m1(a);
	 
	 D d = new D();
	 
//	 recent parent ch ghete only
	 c.m1(d);
	
	 Character c1 ='A';
	 
//	 aata konhich parent nahi unboxing kela object la aani char jari banavla tr exact match
//	 pn nahi tr  object class hai sarvancha parent aahe
	 c.m1(c1);
	 
	 int arr[] = new int[5];
	 
	 arr[1] = 10;
	 
	 
	 int arr1[] = {10,32};
	 
	 System.out.println(arr1[0]);
	 
	 
	 System.out.println("<<<<<<<>>>>>>>>");
	 
	 Case1 c2 =new Case1();
	 c2.m1(new D());
	 
	 c2.m1(Integer.valueOf(10));
	 
//	 c2.m1(20.0f,10.0);
	 
//	 direct convert nahi honar float to double madhe 
	 
	 
	 
	}

}
