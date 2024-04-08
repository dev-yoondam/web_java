package input;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
		//이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기
		//이름 : 000
		//나이 : 0
		//000님의 나이는 0살입니다
		//next() 또는 nextLine()메소드만 사용할것!
		
//		1) 이름, 나이 변수 선언
//		2) 입력 클래스 import
//		3) 이름입력 메시지 출력
//		4) next() 이름 입력
//		5) 나이 입력 메시지 출력
//		6) next() 나이 입력
//		7) 출력
		
		String name = "", age = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.next();
		System.out.println(name + "님의 나이는 " + age + "살입니다");
		System.out.println("내년의 나이는 " + (Integer.parseInt(age)+1) + "살입니다");
		
	}
}










