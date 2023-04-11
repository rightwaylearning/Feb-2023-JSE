package worker.com;

public class Worker_EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Input_Output i = new Input_Output();
		Worker w = new Worker();
		
		w.setWorker_Name("Swapnil");
		w.setWorker_Designation("Engineer");
		w.setAdr(i.get_Worker_Address());
		w.setSalary(i.get_Worker_Salary());
		w.setCompany(i.get_W_Com_Info());
		
		
		Worker w1 = new Worker();

		i.printWorkerDetails(w);

	}

}
