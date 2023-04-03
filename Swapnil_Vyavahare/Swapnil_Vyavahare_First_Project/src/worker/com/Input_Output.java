package worker.com;

public class Input_Output {

	public Address[] get_Worker_Address() {
		Address[] adr = new Address[2];

		Address ad = new Address();
		ad.setLine1("ABC ROAD");
		ad.setLine2("Pune");
		ad.setPin(412105);

		Address ad1 = new Address();
		ad1.setLine1("DEF ROAD");
		ad1.setLine2("Mumbai");
		ad1.setPin(412105);

		adr[0] = ad;

		return adr;

	}

	public int[] get_Worker_Salary() {

		String[] month = new String[3];
		month[0] = "DEC2022";
		month[1] = "Jan2023";
		month[2] = "FEB2023";

		int[] salary = new int[3];
		salary[0] = 10;
		salary[1] = 20;
		salary[2] = 30;

		return salary;

	}

	public Company get_W_Com_Info() {
		Company c = new Company();
		c.setCompanyname("INFOSYS");
		c.setGstNo(454145);

		Address adr = new Address();
		adr.setLine1("XYZ");
		adr.setLine2("PUne");
		adr.setPin(411039);

		c.setAdr(adr);

		return c;

	}

	public void printWorkerDetails(Worker w) {

		System.out.println(w.getWorker_Name());
		System.out.println(w.getWorker_Designation());
		System.out.println("Worker Address");
		Address[] adr = w.getAdr();
		System.out.println(adr[0].getLine1());
		System.out.println(adr[0].getLine2());
		System.out.println(adr[0].getPin());

		int[] salary = w.getSalary();
		String[] month = new String[3];
		month[0] = "DEC2022";
		month[1] = "Jan2023";
		month[2] = "FEB2023";

		int i = 0;

		while (i < salary.length) {
			System.out.println(month[i] + "=" + salary[i]);
			i++;
		}

		Company company = w.getCompany();
		System.out.println(company.getCompanyname());
		System.out.println(company.getGstNo());
		System.out.println(company.getAdr().getLine1());
		System.out.println(company.getAdr().getLine2());
		System.out.println(company.getAdr().getPin());

	}

}
