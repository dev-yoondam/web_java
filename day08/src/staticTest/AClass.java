package staticTest;

public class AClass {
	//필드
	int iVar;
	static int sVar;
	
	//메소드
	void iMethod1() {
		iVar = 10;
		sVar = 20;
		System.out.println(iVar);
		System.out.println(sVar);
		iMethod2();
		sMethod1();
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	//클래스메소드(스태틱메소드)는 static 이 붙은 멤버만 사용가능하다
	static void sMethod1() {
//		iVar = 100; 불가능
		sVar = 200;
		System.out.println(sVar);
//		iMethod1(); 불가능
		sMethod2();
	}
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
	}
}















