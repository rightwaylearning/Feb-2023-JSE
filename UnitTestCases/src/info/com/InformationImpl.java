package info.com;

public class InformationImpl implements Information {

	@Override
	public String getMessage(String message) {
		return "hello "+message;
	}

}
