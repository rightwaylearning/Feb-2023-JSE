package overloadingTypes;

public class OverLoadingOpration {
	public static void main(String[] args) {
		
		DifferentNoOfParameters n=new DifferentNoOfParameters();
		n.m1(10);
		n.m1('A', 'B');
		n.m1(12, 34, 56);
		n.m1(11.3f, 34.76f,76.40f, 87.9f);
		
		DifferentTypeOfParameters n1=new DifferentTypeOfParameters();
	    n1.p('A');
	    n1.p(10,'A');
	    n1.p(12,43.4f);
	    n1.p(10, 55.4f, 1234.888888d);
	    
	    DifferentSequenceOfParameter s1=new DifferentSequenceOfParameter();
	    s1.s(12.45f, 23);
	    s1.s(112, 457.66f);
	    s1.s(23.666, 'A');
	    s1.s(12.5f, 45, 'B');
	    
	}

}
