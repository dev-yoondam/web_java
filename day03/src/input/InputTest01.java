package input;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		//입력메소드를 사용하기 위해서는
		//Scanner 입력 클래스를 불러와야한다
		
		Scanner sc = new Scanner(System.in);
		//Scanner랑 똑같이 생긴 애를 sc라는 변수에 저장해서 쓸거다
		System.out.print("숫자 입력 : ");
		String data = sc.next();
		System.out.println(data);
		System.out.println("출력 끝");
		
	}
}












