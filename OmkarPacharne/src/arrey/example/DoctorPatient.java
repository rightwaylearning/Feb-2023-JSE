package arrey.example;

public class DoctorPatient {

	
	
	public static void main(String[] args) {
		Doctor[]drr=new Doctor[3];
		
		
		Doctor dr =new Doctor();
		dr.setName("dr omkar");
		dr.setRegNo(1);
		drr[0]=dr;
		
		Doctor dr1=new Doctor(2,"dr ashish");
		drr[1]=dr1;
		
		
		drr[2]=new Doctor();
		drr[2].setName("dr prakash");
		drr[2].setRegNo(3);
		
		
		DoctorPatient.printDoctorData(drr);
		
		
	
	}
	public static void  printDoctorData(Doctor[]drr) {
		
		System.out.println(drr[0].getName());
		System.out.println(drr[0].getRegNo());
		System.out.println(drr[1].getName());
		System.out.println(drr[1].getRegNo());
		System.out.println(drr[2].getName());
	    System.out.println(drr[2].getRegNo());
}}
