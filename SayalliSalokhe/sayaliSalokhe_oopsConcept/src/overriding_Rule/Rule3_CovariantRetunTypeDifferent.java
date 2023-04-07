package overriding_Rule;

class Test {
   Object m1()
   {
	return null;
	   
   }  
}
class Test1 extends Test
{
	@Override
	String m1()
	{
		return null;
		
	}
	}

public class Rule3_CovariantRetunTypeDifferent {
	public static void main(String[] args) {

	}

}

// Until 1.4 version return type must same but after 1.5 Co-variant return type  allow

