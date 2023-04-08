package overriding_Rule;



class G{
	
	static void m1() {
		System.out.println("parent");
	}
}

class U extends G{
  // @Override            //The method m1() of type U must override or implement a supertype method
	static void m1() {
		System.out.println("child");
	}
}

public class Rule9_static {
	G g= new U();
	g.m1();	//Syntax error on token "m1", Identifier expected after this token

}
