package admission.pack;

public class TeacherRef {
	
	
//	je ya parameter madhe pass kela aahe local var tech ghya lagte
//	arguments lahi pass kela tr chalte but parameter je aahe tech 
//	local varible ghyav lagte 
	
	Student generateStudentInfo(String name ,int num){
		
		Student s = new Student();
		s.name = name ;
		s.rollNumber = num ;
		
//		System.out.println(s.name);
		
		return s;
	}

}
