package method;

public class MethodTest02 {
	 //메소드 정의
	//1) 매개변수 x, 리턴값 x 메소드 정의
	// 이름을 출력하는 기능
	void printName() {
		System.out.println("===매개변수와 리턴값이 없는 "
				+ "메소드가 호출되었습니다===");
		System.out.println("김영선");
	}
	
	//2) 매개변수 o, 리턴값 x 메소드 정의
	// 정수 1개를 받아서 출력하는 기능
	void printNum(int num) {
		System.out.println("===매개변수는 있고 리턴값이 없는 "
				+ "메소드가 호출되었습니다===");
		System.out.println(num + "입니다");
	}
	
	//3) 매개변수 x, 리턴값 o 메소드 정의
	// 이름을 반환하는 기능
	String getName() {
		System.out.println("===매개변수는 없고 리턴값이 있는 "
				+ "메소드가 호출되었습니다===");
		return "김영선";
	}
	
	//4) 매개변수 o, 리턴값 o 
	// 전달받은 정수를 x2한 값을 반환하는 메소드
	int twoNum(int num) {
		System.out.println("===매개변수와 리턴값이 있는 "
				+ "메소드가 호출되었습니다===");
		int result = num * 2;
		return result;
	}
	
	public static void main(String[] args) {
		MethodTest02 mt = new MethodTest02();
		
		//메소드 호출
		//1) 매개변수 x 리턴값 x 메소드 호출 => 메소드명();
		mt.printName();
		
		//2) 매개변수 o 리턴값 x 메소드 호출 => 메소드명(인수);
		mt.printNum(100);
		
		//3) 매개변수 x 리턴값 o 메소드 호출 => syso(메소드명()); 
//									String 변수명 =  메소드명();
		String name = mt.getName();
		System.out.println(name + "의 java점수는 100점");
		System.out.println(mt.getName() + "의 c점수는 100점");
		
		//4) 매개변수 o 리턴값 o 메소드 => 변수 = 메소드명(인수) or
//										syso(메소드명(인수))
		System.out.println(mt.twoNum(10));
		
		System.out.println("출력끝");
	}
}















