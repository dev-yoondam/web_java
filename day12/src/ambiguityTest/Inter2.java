package ambiguityTest;

public interface Inter2 {
	default void printText() {
		System.out.println("Inter2 인터페이스의 printText() 호출");
	}
}
