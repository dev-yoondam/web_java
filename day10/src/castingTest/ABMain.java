package castingTest;

public class ABMain {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		B b = new B();
		System.out.println(b);
		A ab = new B(); //업캐스팅
		System.out.println(ab);
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		
	}
}
