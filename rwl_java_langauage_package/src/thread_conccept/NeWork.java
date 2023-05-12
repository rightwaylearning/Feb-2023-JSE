package thread_conccept;

public class NeWork {

	public void doNewWork() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());	
		
		for(int i = 1; i<=100;i++) {
			System.out.println("I am doNewWork method "+ i);
		}
	}
}
