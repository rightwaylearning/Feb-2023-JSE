package thread_conccept;

public class Controller {

	public static void main(String[] args) {
		
		MyChildThreadWork child = new MyChildThreadWork();
		child.start();
			
		MyChildThreadWork1 child1= new MyChildThreadWork1();
		child1.start();
		
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		for(int i = 1; i<=100;i++) {
			System.out.println("I am main method "+ i);
		}
	}
}
