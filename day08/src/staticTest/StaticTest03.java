package staticTest;

class B{
	//필드
	int iVar; //인스턴스변수
	static int sVar; //스태틱변수
}

public class StaticTest03 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		b1.iVar = 10;
		b2.iVar = 20;
		System.out.println(b1.iVar);
		System.out.println(b2.iVar);
		
		b1.sVar = 30;
		b2.sVar = 40;
		System.out.println(b1.sVar);
		System.out.println(b2.sVar);
		
		//클래스변수는 하나의 저장공간이다
		//즉, 하나의 클래스로 만든 모든 객체가 공유하는 저장공간이다
		//그러므로 클래스명으로 접근한다
		System.out.println(B.sVar);
	}
}













