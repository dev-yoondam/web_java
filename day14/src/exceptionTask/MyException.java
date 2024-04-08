package exceptionTask;

//사용자 정의 예외 클래스
public class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
