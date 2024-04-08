package throwTest;

public class MyException extends Exception{

	public MyException() {
		super("음수를 입력하면 안돼요");
	}
}
