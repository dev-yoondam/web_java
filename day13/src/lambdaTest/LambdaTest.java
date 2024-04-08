package lambdaTest;

public class LambdaTest {
	
	void printHello() {
		System.out.println("안녕하세요");
	}
	
//	1. 메소드명을 없애고 ()뒤에 ->를 추가한다 
//	void printHello() { System.out.println("안녕하세요"); }
//	void () -> { System.out.println("안녕하세요"); }
	
//	2. 반환타입은 추론이 가능하므로 생략한다
//	() -> { System.out.println("안녕하세요"); }
	
//	3. 명령문이 1줄이면 중괄호와 세미콜론을 생략가능하다(선택)
//	() -> System.out.println("안녕하세요")
	
	int add10(int num) {
		return num + 10;
	}
	
//	1. 이름을 없애고 ()뒤에 ->를 추가한다
//	int (int num) -> { return num + 10; }
	
//	2. 반환타입 추론가능하므로 생략한다(선택)
//	(int num) -> { return num + 10; }
	
//	3. 매개변수의 타입 추론가능하므로 생략한다(선택)
//	(num) -> { return num + 10; }
	
//	4. 매개변수가 1개라면 ()를 생략 가능하다(선택)
//		단, 자료형을 생략하지 않았다면 ()를 생략할 수 없다
//	num -> { return num + 10; }
	
//	5. 명령문이 1줄이면 중괄호와 세미콜론을 생략가능하다(선택)
//	중괄호와 세미콜론을 생략하면 return도 생략해야한다
//	바디의 결과가 값이라면 자동으로 return 된다
//	단, 바디의 명령문이 1줄이어야한다
//	num -> num + 10
	
	int addNumber(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
		return num1 + num2;
	}
	
//	1. 이름을 없애고 -> 추가
//	int (int num1, int num2) -> {
//		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
//		return num1 + num2;
//	}
	
//	2. 반환타입과 매개변수의 타입 추론가능하므로 생략 가능
//	(num1, num2) -> {
//	System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
//	return num1 + num2;
//}
//	3. 매개변수가 2개 이상이므로 () 생략 불가
//	4. 명령문이 2개 이상이므로 {}와 ; 생략불가
//	5. 반환할값이 존재한다면 return 사용
	
//	(num1, num2) -> {
//	System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
//	return num1 + num2;
//}
}



















