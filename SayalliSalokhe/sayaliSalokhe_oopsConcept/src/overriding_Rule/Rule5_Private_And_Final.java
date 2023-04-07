package overriding_Rule;

class H {
	private void m1()
	{
		
	}

}
  //Its Valid but not overriding 
class J extends H {
	//@Override   //The method m1() of type J must override or implement a supertype method
	private void m1()
	{
		
	}
}

public class Rule5_Private_And_Final {
	public static void main(String[] args) {

	}

}
