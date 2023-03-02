package switch_case;

public class ColourSelection {

	String selectcolour(char ch) {
		
		
		String colour;
		
		switch(ch) {
		case 'W':{
			colour="white";
		}
		
		case 'g':{
			
			colour="green";
			
		}
		case 'r' :{
			
			colour="red";
		}
		default: {
			
			colour="no match";
			
		}
		
		
		}
		return colour;
		

}

}


