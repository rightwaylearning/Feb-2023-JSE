package creating.new_thread;

public class MyCriticalWork {

	
	
	synchronized void hitCounter() {
		for(int i = 1; i <=100 ;i ++) {
			System.out.println(">>>>>>> "+Thread.currentThread().getName() +" :  "+ i);
		}
	}
}
