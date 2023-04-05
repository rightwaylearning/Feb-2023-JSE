package child.parent;

public class grandparent {
	public void m1(){
		System.out.println("i am m1 of grandparent");
		
	}
	public void m2(){
		System.out.println("i am m2 of grandparent");
	}
}
	 class parent extends grandparent{
		public void m3() {
			System.out.println("i am m3 of parent");
		}
		public void m2() {
			System.out.println("i am m2 of parent");
		}
	 }
	class child extends parent{
		 public void m3() {
			System.out.println("i am m3 of child");
		}
		 public void m4() {
			System.out.println("i am m4 of child");
		}
	}


