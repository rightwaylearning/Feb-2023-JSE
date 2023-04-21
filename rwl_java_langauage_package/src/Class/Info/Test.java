package Class.Info;

import java.lang.reflect.Constructor;
import java.util.Iterator;

class Student{
	int a;
	int b;
	
	
	
	
	Student(int a, int b){
		
	}
Student(){}
	
	Student(int a){}
}


public class Test {

	public static void main(String[] args) {
		
		Class c1 = Student.class;
		
		System.out.println(c1.getName());
		
		//------------------------------------------
		Student s= new Student();
		Class c2= s.getClass();
		System.out.println(c2.getName());
		
		
		Constructor[] con = c2.getDeclaredConstructors();
		System.out.println(con.length);
		for(int i =0 ;i <con.length;i++) {
			System.out.println(con[i].getName()+"  "+con[i].getParameterCount());
		}
		
	}
}
