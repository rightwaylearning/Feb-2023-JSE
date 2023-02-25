package array_Declaration;

public class Contrller_StudentReference_Array {
	
	public static void main(String[] args) {
		
		// declaration of reference array.
		StudentReference_Array[] array = new StudentReference_Array[4];
		
	//--------------------------------------------------------------------------
		StudentReference_Array array1=new StudentReference_Array(1, "sayali");
		System.out.println(array1.roll_No);
		System.out.println(array1.name);
		
		
	//--------------------------------------------------------------------------	
		StudentReference_Array array2=new StudentReference_Array();
		array2.setRoll_No(2);
		array2.setName("yogesh");
		System.out.println(array2.roll_No);
		System.out.println(array2.name);
	//---------------------------------------------------------------------------
		array[2]= new StudentReference_Array(3,"Radha");

	//----------------------------------------------------------------------------
		array[3]=new StudentReference_Array();
		array[3].setRoll_No(4);
		array[3].setName("Nisha");
		
    //-----------------------------------------------------------------------------
		Contrller_StudentReference_Array.printStudentData(array);
	}
	
	public static void printStudentData(StudentReference_Array[] array)
	{
		
		System.out.println(array[2].getRoll_No());
		System.out.println(array[2].getName());
		System.out.println(array[3].getRoll_No());
		System.out.println(array[3].getName());
		
	}

}
