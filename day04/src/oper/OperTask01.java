package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기
		
		//정수1 입력 : 10
		//정수2 입력 : 20
		//정수1 보다 정수2가 더 큽니다
		
		//로직구성!!
		//1) 입력클래스 import
		//2) 변수 3개(int 2개, String 1개)
		//3) 입력 메시지1
		//4) 변수1 입력 메소드
		//5) 입력 메시지2
		//6) 변수2 입력메소드
		//7) 변수3 삼항연산자
		//8) 변수3 출력
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = "", msg = "정수 입력 : ";
		
		System.out.println(msg);
		num1 = sc.nextInt();
		System.out.println(msg);
		num2 = sc.nextInt();
//		result = num1 > num2 ? "큰 수:" + num1 : "큰 수 : " + num2;
		System.out.println(result = num1 > num2 ? "큰 수:" + num1 : num1 == num2?
				"같습니다" : "큰 수 : " + num2);
		
//		System.out.println(result);

	}
}








