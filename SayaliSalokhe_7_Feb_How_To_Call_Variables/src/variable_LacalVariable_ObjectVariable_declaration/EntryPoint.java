package variable_LacalVariable_ObjectVariable_declaration;

import variable.local_variable_declarartion.Test;

public class EntryPoint {
	public static void main(String[] args) {
		Simple s=new Simple();
		s.a=10;
		s.b=20;
		s.m1(s);
		
		/*Simple s1=new Simple();
		s1.a=1;
		s1.b=2;
		s1.m1(s1);*/
	}

}
