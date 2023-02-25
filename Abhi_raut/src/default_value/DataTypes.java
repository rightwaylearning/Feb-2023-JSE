package default_value;

public class DataTypes {
	// default values for instance (primitive and reference type) and 
	// default values for static are same;
	
	byte b;     // 0
	short s;     // 0
	int i;       // 0
	long l;     // 0
	float f;    // 0.0
	double d;   // 0.0 
	char c;     // empty space []
	boolean b1; // false
	
	String str;  // null
	Student st;  // null
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public byte getB() {
		return b;
	}
	public void setB(byte b) {
		this.b = b;
	}
	public short getS() {
		return s;
	}
	public void setS(short s) {
		this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public long getL() {
		return l;
	}
	public void setL(long l) {
		this.l = l;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	
	

}
