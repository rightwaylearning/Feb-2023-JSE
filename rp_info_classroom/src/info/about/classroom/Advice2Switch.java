package info.about.classroom;

public class Advice2Switch {

	public static String m1(int ageInMonths) {

		String str = "kuch nahi";

		if (24 <= ageInMonths && ageInMonths < 36) {

			return "24-36";
		} else if (36 <= ageInMonths && ageInMonths < 48) {

			str = "36-48";

			return str;
		} else if (48 <= ageInMonths && ageInMonths < 60) {

			str = "48-60";
			
		} else if (60 <= ageInMonths && ageInMonths < 72) {

			str = "60-72";
		}

		return str;

	}

	public ClassRoom m2(String str) {   //60-72

		ClassRoom cr = null;
		
		switch (str) {
		
		
		case "24-36": {

			cr = new ClassRoom("PlayGroup",24,36,40000.00);
		
			
			break;
		}

		case "36-48": {

			
			cr = new ClassRoom("Nursery",36,48,45000.00);
			
			break;
		}

		case "48-60": {

			
			cr = new ClassRoom("LKG",48,60,50000.00);
	

			break;
		}
       case "60-72":{

			
			cr = new ClassRoom("UKG",60,72,65000.00);

			break;
		}

		default:{
		
		    System.out.println("Your age is Not matched sorry"); 
			break;
		}
		
		}
		
		
		return cr;		
	

}
	}
