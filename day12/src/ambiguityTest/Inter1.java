package ambiguityTest;

public interface Inter1 {
	default void printText() {
		System.out.println("Inter1 인터페이스의 printText() 호출");
	}
}
