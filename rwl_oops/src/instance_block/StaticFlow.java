package instance_block;

public class StaticFlow {

	static {
		System.out.println("I am static block 1");
	}

	static {
		System.out.println("i am static block 2");
	}

	StaticFlow() {
		System.out.println("I am constrcutor");
	}

	{
		System.out.println("I am instance block 1");
	}
	{
		System.out.println("I am instance block 2");
	}

	public static void main(String[] args) {
        System.out.println("I am main method");
        System.out.println("-------------");
        StaticFlow a= new StaticFlow();
        System.out.println("----------");
        StaticFlow a1= new StaticFlow();
        
        
        A a3= new A();
        
	}
}
