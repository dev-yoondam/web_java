package oper;

public class OperTest02 {
	public static void main(String[] args) {
		//삼항연산자
		//조건식 ? 참일 때 값 : 거짓일 때 값
		int num1 = 10, num2 = 20, num3 = 20;
		String num4 = num1 >= 9 ? num1 + "이 9보다 큽니다" : "num1은 9보다 크지않습니다";
		
		System.out.println(true ? 10 : 20);
		System.out.println(false ? 10 : 20);
		
		System.out.println(num1 == num2 ? "같다" : "다르다");
		System.out.println(num1 != num2 ? "같다" : "다르다");
		System.out.println(num4);
		
		
	}
}
