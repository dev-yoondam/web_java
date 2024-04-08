package test;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);를 import해준다 int타입으로 변수 3개를 선언한다 출력메소드를
		 * 만들어 입력메시지를 출력한다 각 변수에 입력받은 정수를 대입한다 3수가 다 짝수 / ㅁㅁ만 짝수 / ㅁ만 짝수 나머지연산 사용 2로나눠서
		 * 나머지가 0이면 짝수, 1이면 홀수
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;

		System.out.print("정수 1 입력 :");
		num1 = sc.nextInt();
		System.out.print("정수 2 입력 :");
		num2 = sc.nextInt();
		System.out.print("정수 3 입력 :");
		num3 = sc.nextInt();
		System.out.println((num1 + num2 + num3) % 2 == 0 ? "세 수가 모두 짝수입니다" : "세 수가 모두 짝수이진 않습니다.");

	}
}
