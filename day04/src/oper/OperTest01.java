package oper;

public class OperTest01 {
	public static void main(String[] args) {
		//관계연산자
		int num1 = 10, num2 = 20;
		boolean isTrue = !false;
		
		System.out.println(isTrue);
		System.out.println(10 == 20);
		System.out.println(10 != 20);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(isTrue);
		System.out.println("===============");
		//논리연산자
		//&& 둘다 true여야만 true
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println("===============");
		//|| 둘 중 하나라도 true면 true
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println("===============");
		System.out.println(num1 == 10 && num2 == num1);
		System.out.println(num1 < 15 || num2 >= 20);
		System.out.println(num1 < 15 && num2 > 20);
		System.out.println("===============");		
		System.out.println(!true);
		System.out.println(!(num1 == 10));
	}
}














