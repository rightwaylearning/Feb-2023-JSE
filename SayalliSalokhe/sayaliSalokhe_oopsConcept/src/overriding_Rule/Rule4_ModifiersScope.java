package overriding_Rule;


class M{
	protected void m1()
	{
		
	}
}

class M1 extends M{
	public void m1()
	{
		
	}
}

class M2 extends M{
	 void m1()  //Cannot reduce the visibility of the inherited method from M
	{
		
	}
}
//parent-----child
//public --> public
//protected -->public,Protected
//default -->public,protected,default
public class Rule4_ModifiersScope {
	public static void main(String[] args) {
		
	}

}
