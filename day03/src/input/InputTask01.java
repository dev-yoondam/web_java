package input;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		//이름을 입력하세요 : 000
		// 000님 안녕하세요 출력
		
//		1) 입력클래스
//		2) import
//		3) 이름을 입력하세요 출력 print()
//		4) String 타입 변수 입력메소드 .next()
//		5) 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
//		System.out.print(name + "님 안녕하세요");
//		System.out.printf("%s님 안녕하세요", name);
		System.out.println(name);
	}
}













