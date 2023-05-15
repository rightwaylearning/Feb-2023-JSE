package creating.new_thread;

public class MyThreadJob extends Thread {
	
	MyCriticalWork work;
	
	MyThreadJob(MyCriticalWork work){
		this.work = work;
	}

	@Override
	public void run() {
		work.hitCounter();
	}
}
