package abstractTest;

public abstract class ClassA {
	//추상클래스의 멤버 : 추상메소드, 일반메소드, 필드, 생성자
	abstract void method1();
	void method2() {
		System.out.println("메소드2 실행");
	}
}
