package test;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);를 import해준다 int타입으로 변수 2개를 선언한다
		 * 출력메소드를 만들어 입력메시지를 출력한다
		 * 각 변수에 입력받은 정수를 대입한다
		 * 조건문 : true일때값 : false일때값을 사용
		 * 둘 다 양수 ? "둘 다 양수입니다" : 1만 양수 ? "1만 양수" : 2만 양수 ? "2만 양수" : 둘 다 음수
		 * 출력메소드에 조건식을 넣어 결과를 출력한다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		System.out.print("정수 1 입력 :");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 :");
		num2 = sc.nextInt();

		System.out.println(num1 > 0 && num2 > 0 ? "두 수 모두 양수입니다."
				: num1 > 0 ? "num1만 양수입니다" : num2 > 0 ? "num2만 양수입니다" : "둘 다 양수가 아닙니다.");

	}
}
