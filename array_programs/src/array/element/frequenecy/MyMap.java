package array.element.frequenecy;

public class MyMap {

	private Integer key;
	private Integer value;
	
	public MyMap() {}
	
	
	
	public MyMap(Integer key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}



	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyMap [key=" + key + ", value=" + value + "]";
	}
	
	
}
