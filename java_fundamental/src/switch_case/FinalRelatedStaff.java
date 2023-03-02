package switch_case;

public class FinalRelatedStaff {

	public static void main(String[] args) {

		char ch = 'M';

		final char b1 = 'B';

		switch (ch) {

		case b1: {

		}

		case 'C': {

		}

		}

		// -------------------------------------
		final int x = 80;

		int a = 90;

		switch (a) {

		case 100: {

		}

		case 10 + x: {

		}

		}

		// ------------------------------------------------

		float f = 90.90F;
		double d = 90.89;

//        switch(d)   // byte,short, int,char., String
//        {
//        
//        }	

		// ----------------------------------------------

		int m = 10;

		switch (m) {

		case 100: {

		}

		case 90: {

		}
		case 101: { // Duplicate case

		}

		}

		// -----------------------------------------

		byte b = 10; // -128 to 127

		switch (b) {

		case 100: {

		}

		case 20: {

		}

		}

	}
}

// in switch all labels are compile time const.
