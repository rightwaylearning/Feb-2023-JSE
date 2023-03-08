package two_d_arrays;

public class SampleTest {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		// here arr1 is reference variable , pointing to 1D array having 5 int type elements
		
	     Student[] arr2= new Student[5];
	    // here arr2 is reference variable , pointing to !D array having 5 Student type elements 
	
	    int[] arr3 = {10,20,30,40,50}; 
	    
	    arr3[4] = 100;
      //  Student[] arr4 = {s1,s2,s3,s4};     
	    
	    Student[] arr4 = {new Student(),new Student(10,"A")};
	    
	    arr4[0].setName("BBB");
	    arr4[0].setRollNo(1);
	    
	    arr4[1].setName("KLM");
	    
		// -----------------------------------------
	    
	    System.out.println(arr4[0] instanceof Student);
	    System.out.println(arr4 instanceof Student[]);
	}
}

class Student{
	private Integer rollNo;
	private String name;
	
	public Student() {}

	public Student(Integer rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}