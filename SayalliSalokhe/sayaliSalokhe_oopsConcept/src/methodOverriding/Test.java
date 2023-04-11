package methodOverriding;

class parent1 {
	public void property() {
		System.out.println("Cash+land+gold");

	}

	public void marry() {
		System.out.println("shantanu");

	}
}

	class child1 extends parent1 {

		public void marry() {
			System.out.println("rahul/mahesh/raj");

		}
	}

	public class Test {
		public static void main(String[] args) {
			parent1 parent1=new parent1();
			parent1.property();
			parent1.marry();
			System.out.println("----------------------------------------");
			child1 c4=new child1();
			c4.marry();
			c4.property();
			System.out.println("----------------------------------------");
			parent1 parent12=new child1();
			parent12.marry();
		    parent12.property();
			
			
			
			
		}

	}


