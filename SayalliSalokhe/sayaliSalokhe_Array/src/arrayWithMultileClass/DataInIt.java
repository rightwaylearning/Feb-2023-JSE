package arrayWithMultileClass;

public class DataInIt {

	public int[] getmarks() {
		int[] marks = new int[5];
		marks[0] = 76;
		marks[1] = 76;
		marks[2] = 70;
		marks[3] = 77;
		marks[4] = 76;
		return marks;
	}
	public void displaymarks(Student s)
	{
		int[] marks = s.getMarks();
		int i=0;
		System.out.println("Subject Marks:");
		while(i<marks.length)
		{
			System.out.println(marks[i]);
			i++;
		}
	}
}
