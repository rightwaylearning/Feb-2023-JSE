package calculator.maths.addition;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Maths m = new Maths();
		
		m.add(43,32,24,54,5465,76,878,43,54,65,76);
		
		VarArgMethod v =new VarArgMethod();
		v.ele("hello","rere","rerer","hello2");
		
//		The method ele(String[]) in the type VarArgMethod is not 
//		applicable for the arguments (String, String, String, String)
	}

}
