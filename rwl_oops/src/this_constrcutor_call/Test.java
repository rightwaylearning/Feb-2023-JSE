package this_constrcutor_call;

class Parent{
    int a,b;
	Parent(){
		System.out.println("I am Parent class constructor");
	}
}
class Child extends Parent{
	int x,y;
	
	Child(){
		this(1,2);
		System.out.println("I am Child class zero arg constrcutor call");
	}
	
	Child(int num){
		this(num,num);
	}
	
	Child(int x, int y){
		System.out.println("I am child class 2 parameter constrcutor call");
	    this.x =x;
		this.y =y;
	}
	
}
public class Test {

	public static void main(String[] args) {
		Child c= new Child();
		System.out.println(c.x);
		System.out.println(c.y);
	}
}
