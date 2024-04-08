package typeCasting;

public class CastingTest02 {
	public static void main(String[] args) {
		//자동형변환
		//정수 + 정수 = 정수
		int num1 = 10, num2 = 20;
		//printf출력메소드 이용  10 + 20 = 30 
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		
		//실수 + 실수 = 실수
		double num3 = 10.0, num4 = 5.3;
		System.out.printf("\n%.1f + %.1f = %.1f\n", num3, num4, num3 + num4);
		System.out.println(num3 + num4);
		
		//정수 + 실수 = 실수
		System.out.println(num1 + num3);
		
		//+) 실수형값이 제대로 나오지 않는 문제 : 부동 소수점 연산의 한계
		//부동소수점 연산 : 컴퓨터에서 실수를 표현하는 방법 중 하나, 정확도에 제한이 있다
		double number1 = 0.1;
		double number2 = 0.2;
		System.out.println(number1 + number2);
	}
}
