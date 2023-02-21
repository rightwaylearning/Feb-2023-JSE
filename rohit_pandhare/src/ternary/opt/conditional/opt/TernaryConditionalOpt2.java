package ternary.opt.conditional.opt;

public class TernaryConditionalOpt2 {

	public static void main(String[] args) {
		
		int a =32555, b =4343 ,c= 312344;
		
		if(a>b && a >c) {
			System.out.println("a is greater element");
		}
		else if(b>a && b >c){
			System.out.println("b is greater element");
		}else {
			System.out.println("c is greater");
		}
		
//		ya madhe ternary opt use kela tr boolean exp ? true : false
//				boolean exp true aasel tr a print hoil nasta else
		
//		ya madhe exp first aaste mg nantr jr true aasel te excute hoil
//		nasta else part expression execute mhnjech false aasel tr tithe jail
//		mg parat te true aasel tr value return karel naste else part
		int result = (a>b && a >c)? a :(b>a && b >c)?b:c;
		
		System.out.println("the greater element is " + result);

	}
}
