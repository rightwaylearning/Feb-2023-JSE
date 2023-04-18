
interface AAA{
	
	void m1();
}

interface BBB{
	void m2();
}

interface III extends AAA,BBB{
	
}

class MySelfMe implements III{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}




public class InterfaceRel {

}
