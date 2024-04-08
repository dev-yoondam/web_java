package ambiguityTest;

public interface Inter3 {
	default void printText() {
		System.out.println("Inter3 인터페이스의 printText() 호출");
	}
}
