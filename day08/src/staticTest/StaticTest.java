package staticTest;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
//		System.out.println(st);
		
		st.iMethod1();
		st.sMethod1(); //실행가능하지만 권장하지 않음

		sMethod1();
	}
	
	void iMethod1() {
		System.out.println("인스턴스 메소드1 실행");
		iMethod2(); //메소드 호출 o
		sMethod1();
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");
		sMethod2();
	}
	
	static void sMethod1() {
		System.out.println("스태틱 메소드1 실행");
//		iMethod1(); 실행불가능
	}
	
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
//		iMethod2(); 실행불가능
		sMethod1();
	}
}
