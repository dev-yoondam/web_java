package construtorTest;

class A {
	//메소드 매개변수x, 리턴값x
	void method() {
		System.out.println(this);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		a.method();
		A a1 = new A();
		System.out.println(a1);
		a1.method();
	}
}










