package method;

public class MethodTest01 { //클래스 시작

	//10을 더해주는 메소드
	int addTen(int num)  //선언부
	{	//구현부
		int result = num + 10;
		return result;
	}
	
	public static void main(String[] args) { //메인메소드 시작영역
		MethodTest01 mt = new MethodTest01();
		System.out.println(mt);
		System.out.println(mt.addTen(10));
		//메소드 호출(사용)시 빨간색 밑줄에러 해결방법
		//1) 메소드 선언 부에 static 키워드를 붙히는 방법
		//2) 메인 메소드안에서 클래스의 참조변수를 만들고 참조변수를 이용하는 방법
		
	} //메인메소드 종료영역

} //클래스 종료











