package whileTest;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		// 안녕하세요 000님 환영합니다 10번 출력
		// 로직구성
		// 1) 카운트 변수 선언
		// 2) while (카운트변수 < 11){
		// 3) 출력문(안녕하세요 000님 환영합니다)
		// 4) ++ 증감연산자
		// }
		
		//로직구성
		// 1) 입력 클래스 import
		// 2) 이름 변수 선언
		// 3) 카운트 변수(반복횟수를 조건식)
		// 4) while문 {
		// 5) 입력받을 메시지
		// 6) 이름 입력 메소드
		// 7) 출력 메시지
		// 8) ++ 증감연산자
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int cnt = 1;
		while(cnt < 11) {
			System.out.println("이름을 입력하세요 : ");
			name = sc.nextLine();
			System.out.println("안녕하세요 " + name + "님 환영합니다");
			cnt++;
		}
	}
}











