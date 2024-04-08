package control;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = "";
		
		System.out.println("1부터 4까지 정수 입력 : ");
		choice = sc.nextInt();
//		System.out.println(choice);
		
		switch(choice) {
		case 1: case 3:
			result = "홀수";
			break;
		case 2: case 4:
			result = "짝수";
			break;
//		case 3:
//			result = "홀수";
//			break;
//		case 4:
//			result = "짝수";
//			break;
		default:
			result = "잘못입력했습니다";
			break;
		}
		System.out.println(result);
		
		
	}
}





















