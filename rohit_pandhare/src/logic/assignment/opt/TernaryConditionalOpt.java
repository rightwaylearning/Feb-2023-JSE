package logic.assignment.opt;

public class TernaryConditionalOpt {

	public static void main(String[] args) {
		
		int a = 32 , b =54;
		
//		if(a>b) {
//			System.out.println("a is greater element");
//		}
//		else {
//			System.out.println("b is greater element");
//		}
		
//		ya madhe ternary opt use kela tr boolean exp ? true : false
//				boolean exp true aasel tr a print hoil nasta else
		int result = (a>b)? a :b;

		System.out.println("the big element is "+result);
	}
}
