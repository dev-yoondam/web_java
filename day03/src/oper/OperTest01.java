package oper;

import java.util.Scanner;

public class OperTest01 {
	public static void main(String[] args) {
		//두 자리수 정수를 입력받고 십의 자리와 일의자리를 각각 출력하기
//		1) 입력클래스 import
//		2) 정수형 변수 3개 선언
//		3) 출력 메시지(두자리수 정수 입력 : )
//		4) 입력 받아서 변수에 저장(nextInt())
//		5) 십의자리 / 10
//		6) 일의자리 % 10
//		7) 출력
		Scanner sc = new Scanner(System.in);
		int inputNum = 0, result1 = 0, result2 = 0;
		System.out.println("두자리 정수를 입력하세요 : ");
		inputNum = sc.nextInt();
		
		result1 = inputNum / 10;
		result2 = inputNum % 10;
		System.out.println("십의자리 : " + result1);
		System.out.println("일의자리 : " + result2);
	}
}



















