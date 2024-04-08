package test;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	
//	사용자로부터 영어 소문자 알파벳을 입력받아 해당 알파벳이 모음(a, i, o, u, e)인지 자음인지 판별하여 출력하세요.
	Scanner sc = new Scanner(System.in);
	String small = sc.nextLine();
	char small2 = small.charAt(0);
	
	switch (small2) {
	case 97: case 101: case 105: case 111: case 117: {
		System.out.println("해당 알파벳은 모음입니다");
		break;
	}
	default:
		System.out.println("자음입니다");
	}
}
}
