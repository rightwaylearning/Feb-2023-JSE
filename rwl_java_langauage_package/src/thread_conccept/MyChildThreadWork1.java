package thread_conccept;

public class MyChildThreadWork1  extends Thread{

	@Override
	public void run() {
		
		NeWork  job = new NeWork();
		job.doNewWork();
	}
}
