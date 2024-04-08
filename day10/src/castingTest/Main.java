package castingTest;

public class Main {
	public static void main(String[] args) {
		//자료형 변수명 = 값;
		//클래스타입 참조변수명(객체) = 참조값;
		Tv tv = new Tv();
		SmartTv sTv = new SmartTv();
		
		//tv 슈퍼클래스의 객체 : 필드 3개, 메소드 3개 접근 가능
		//sTv 서브클래스의 객체 : 필드 3개, 메소드 4개 접근 가능
		
//		1. Up Casting : 자식 참조값을 부모 타입의 참조변수
		Tv t1 = new SmartTv();
//		부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다
//		부모클래스 타입의 참조변수에 자식 클래스 타입의 객체의 주소값을 저장한다
		Tv t2 = sTv;
		Tv t3 = (Tv)new SmartTv();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.ch = 10;
		t1.vol = 5;
		t1.power = true;
		t1.chUp();
//		t1.netflex(); 
//		t1 객체는 업캐스팅되었기 때문에 자식 클래스에 있는 멤버를 사용할 수 없다
		
		//2. Down Casting
//		Up casting된 객체를 원래 본인의 클래스 타입으로 변환
		
		//강제형변환
//		자료형 변수명 = (자료형)값;
		int num = (int)5.2;
		SmartTv s1 = (SmartTv) t1;
		s1.netflix();
		
		//잘못된 DownCasting
//		SmartTv s2 = (SmartTv)tv;
//		System.out.println(s2);
//		DownCasting은 반드시 Up Casting 이 된 값으로 해야한다
//		Up casting 된 값을 다시 원래 자식 타입으로 돌리것이 Down Casting이다
		
	}
}






















