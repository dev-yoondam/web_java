package day01;

import java.util.Scanner;

public class Test17 {
public static void main(String[] args) {
//	17. 두 개의 정수형 변수 num1과 num2를 선언하고, 
//	사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기
	Scanner sc = new Scanner(System.in);
	int num1 = 0, num2 = 0;
	System.out.println("정수 두 개를 입력하시오");
	num1 = sc.nextInt(); num2 = sc.nextInt();
	System.out.println(num1 + num2);
	
}
}
