package instance0f.opt;

class A {
}

class B extends A {
}

class C extends B {
}

class D {
}

public class Case1 {

	public static void main(String[] args) {

		A a = new A();

		Object o = new A();

		C c = new C();

		D d = new D();

//	boolean r1 = a instanceof D;
//	System.out.println(r1);

//	aasa kela tr error yeil karan kahi relation nahiye dogha madhe
//	na parent class na child class tya mule error yete

		boolean r2 = o instanceof D;
		System.out.println(
				"relation aahe parent child class ch but o ref var point karat aahe fkt A class kadhe tya mule D kadhe point nahi karu shakt ref var "
						+ r2);

//	compile time error nahi karat parent child class relation aahe

//	yacha aarth aasa hoto ki o madhe A cha data store hoat aahe 
//	tya mule D class cha data point nahi karu shakt o ref kadhe 

//	mhnjech o ref var A class kadhe point karat aahe tr o ref var 
//	D kadhe point nahi karu shakat 

		boolean r3 = c instanceof C;
		System.out.println(r3);

//		example 
		
		C o1 = new C();
		B c1 = o1;
		boolean r4 = c1 == o1;
		System.out.println(r4);

//		aasa example aahe
		
		C o2 = new C();
		B b2 = new B();
		
		boolean r5 = o2 == b2;
		System.out.println(r5);

		C o3 = new C();
		B b3 = o3;
		
		boolean r6 = o3 == b3;
		System.out.println(r6);
	}

}
