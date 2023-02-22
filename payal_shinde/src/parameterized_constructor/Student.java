package parameterized_constructor;

public class Student {
	
		private String name;
		private int rollNumber;
		
		public Student(){}

		public Student(String name, int rollNumber) {
			this.name = name;
			this.rollNumber = rollNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
	}


