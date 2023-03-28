package child.parent;

public class GrandParent {
	void m1() {
		System.out.println("i am m1 method of grandparent class");
	}

	void m2() {
		System.out.println("i am m2 method of grandparent class");
	}

	class parent extends GrandParent {
		void m2() {
			System.out.println("i am m2 method of parent class");
		}

		void m3() {
			System.out.println("i am m2 method of parent class");
		}

	}

	class child extends parent {
		void m3() {
			System.out.println("i am m2 method of child class");
		}

		void m4() {
			System.out.println("i am m2 method of child class");
		}

	}
}
