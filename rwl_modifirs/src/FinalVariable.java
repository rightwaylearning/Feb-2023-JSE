
public class FinalVariable {

	final int a;
	
	public FinalVariable(int a) {
		this.a =a;
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable(100);
		obj.a = 300;
		
		
		FinalVariable obj1= new FinalVariable(200);
	}
}
