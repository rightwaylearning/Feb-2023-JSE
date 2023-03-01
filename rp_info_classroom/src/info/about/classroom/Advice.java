package info.about.classroom;

public class Advice {
	
	public ClassRoom inputOutPut(int ageInMonths) {
		
		ClassRoom cr = null;
		
//		fkt if ch lihila tr har ek condition check karat baste tya mule else if ghetla
		
		if (24 <= ageInMonths && ageInMonths < 36) {
			
			cr = new ClassRoom("PlayGroup",24,36,40000.00);
		}else if (36 <= ageInMonths && ageInMonths < 48) {
			
			cr = new ClassRoom("PlayGroup",36,48,45000.00);
		}else if (48 <= ageInMonths && ageInMonths < 60) {
			
			cr = new ClassRoom("PlayGroup",48,60,50000.00);
		}else if (60 <= ageInMonths && ageInMonths < 72) {
			
			cr = new ClassRoom("PlayGroup",36,48,45000.00);
		}
       
       return cr;
       
	}

}
