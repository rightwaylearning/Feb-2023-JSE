package method_overriding_rules;

class G{
	static void m1() {
		System.out.println("Parent");
	}
}

class U extends G{
  
	static void m1() {
		System.out.println("Child");
	}
}


public class Rule6 {
	
public static void main(String[] args) {
	G g= new U();
	g.m1();
}

}
