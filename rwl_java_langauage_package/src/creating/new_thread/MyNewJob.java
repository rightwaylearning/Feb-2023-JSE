package creating.new_thread;

public class MyNewJob extends Thread{
	
	MyCriticalWork work;

	MyNewJob(MyCriticalWork work){
		this.work = work;
	}

	@Override
	public void run() {
	  work.hitCounter();
	}
}
