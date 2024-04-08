package test;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
/*
 * Scanner sc = new Scanner(System.in);를 import해준다
 * int타입으로 변수 2개를 선언한다
 * 정수 입력받을 출력메소드를 만든다
 * 각 변수에 입력받은 정수를 대입한다
 * 1.
 * 삼항연산자 조건문 ? true일때값 : false일때값 을 사용하여 출력메소드로 출력해준다
 * 조건문은 관계연산자 ==를 사용한다
 * 2. 
 * if문을 사용하여 조건식에 num1 == num2로 true/ false에 맞는 문구를 출력메소드로 출력한다.
 * 조건문은 관계연산자 ==를 사용한다

 * */
	Scanner sc = new Scanner(System.in);
	int num1 = 0, num2 = 0;
	System.out.print("정수 1 입력 :");
	num1 = sc.nextInt();
	System.out.print("정수 2 입력 :");
	num2 = sc.nextInt();
	//삼항연산자
	System.out.println(num1 == num2 ? "두 수가 같습니다." : "두 수는 같지 않습니다.");
	//조건문
	if(num1 == num2) {
		System.out.println("두 수가 같습니다.");
	}else {
		System.out.println("두 수는 같지 않습니다.");
	}
	
	
}
}
