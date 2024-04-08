package markerTest;

public class SomeClass implements MarkerInterface{
	//필드
	private String data;

	//생성자(매개변수1)
	public SomeClass(String data) {
		super();
		this.data = data;
	}

	//메소드 getter
	public String getData() {
		return data;
	}
	
}
