package thread_conccept;

public class MyChildThreadWork extends Thread{
	@Override
	public void run() {
		Work w=new Work();
		w.doWork();
	}

}
