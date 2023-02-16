package logical.building_13date;

public class TestingLogical14 {
	
	public static void main(String[] args) {
		
		Logical l = new Logical();
		
//		l.m1(43, 32);
//		ekde aasa expression lihav lagat karan argument pass kela
//		aahe yete but boolean chi value aahe ti m1 ya method madhe
//		store hote aani aapn te call kela ki tyachi value yete
		
//		if chya madhe conditional expression pahije condition nahi
		if(l.m1(32, 440)) {
			System.out.println("hello this is method if yes then call this method");
		}
		
//		aata ya method call madhe return value yete karan aapn tithe return
//	    type kela aahe tyat eka madhe 1 > 32 aasa kela yachi value
//	    aata true false madhe return hoil tr hai expression aaste
//		condition nahi
		if(l.firstNumber() > l.secondNumber()) {
			System.out.println("hello this is int return type method if yes then call this method");
		}
		
		System.out.println("if if expression is false then this can call");
	
	
	
	}

}
