package thread_conccept;

public class Work {

	public void doWork() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());		
		for(int i = 1; i<=100;i++) {
			System.out.println("I am doWork method "+ i);
		}
	}
}
