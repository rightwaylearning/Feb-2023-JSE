package getter_setter_example;

public class Employee {

	private int eId;
	private String eName;
	private String eDesignation;
	private String eComapany;

	public int geteId()

	
	{
	  return eId;
	  
	}

	   public void seteId(int eId)
	   
	   
	{      this.eId= eId;
	
	
	}


	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public String geteComapany() {
		return eComapany;
	}

	public void seteComapany(String eComapany) {
		this.eComapany = eComapany;
	}
	
	  public String toString()	  
	  {  
		  String str = "Employee: [id = " + geteId() + ", name = " + geteName() + ", designation = " + geteDesignation() + ", company = " + geteComapany() + "]";  
	        return str;
	  }
		
		
		
		
		
	}