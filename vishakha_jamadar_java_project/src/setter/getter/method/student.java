package setter.getter.method;

public class student {
 private int rollnum ;
 private String name;
 private String Cname ;
 
 public void setCname(String Cname) {
	 this.Cname=Cname;
 }
 public String getCname () {
	 return Cname;
	 
 }
 
 
 public void setname(String name) {
	 this.name=name;
 }
 public  String getname() {
	 return name;
 }
 
 public void setrollnum(int rollnum) {
         this.rollnum=rollnum;
 }
 public int  getrollnum() {
	 return rollnum ;
 }
 
}
