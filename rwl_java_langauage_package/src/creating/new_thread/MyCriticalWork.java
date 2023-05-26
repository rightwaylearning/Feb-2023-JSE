package creating.new_thread;

public class MyCriticalWork {

	private Integer counter = 5;
	
	void hitCounter() {
		for(int i = 1; i <=100 ;i ++) {
			System.out.println(">>>>>>> "+Thread.currentThread().getName() +" :  "+ counter);
			counter = counter + 5;
		}
	}
}
