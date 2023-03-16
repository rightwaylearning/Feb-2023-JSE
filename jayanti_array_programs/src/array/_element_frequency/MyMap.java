package array._element_frequency;

public class MyMap {
	
	private Integer key;
	private Integer value;
	
	//dafult constructor
	public MyMap() {}
	
	//parameterized constructor
	public MyMap(Integer key, Integer vlue) {
		this.key= key;
		this.value = value;
	}
	
	//getters
	
	public Integer getKey() {
		return key;
		
	}
	
	public Integer getValue() {
		return value;
	}
	
	//setters
	public void setKey(Integer key) {
		this.key = key;
	}
	
	public void setValue(Integer value) {
		this.value= value;
	}
	
	
	@Override
	public String toString() {
		return "MyMap [key=" + key +", value =" + value + "]";
		
	}

}
