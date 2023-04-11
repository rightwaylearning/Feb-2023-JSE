package overriding_Rule;

class H1 {               //Non-Final-Final Allow
	 void m1()
	 {
		 
	 }
	}
class H2 {            //Final
	final void m1() {
                       
	}

}

//but Final-Final Not allow
class J1 extends H2 {
	@Override // Cannot override the final method from H1
	final void m1() {

	}
}

public class Rule6_Final {
	public static void main(String[] args) {

	}

}
