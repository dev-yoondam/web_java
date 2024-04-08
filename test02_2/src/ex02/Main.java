package ex02;

// 윤담
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// 만약 num2가 음수거나 0이라면 이니까 num2를 try catch로 묶어서 처리
		// "만약 숫자가 아닌거 입력한다면" 이니까 전체를 try catch

		try {
			System.out.print("나누어질 숫자를 입력하세요 : ");
			num1 = sc.nextInt();
			System.out.print("나눌 숫자를 입력하세요 : ");
			try {
				num2 = sc.nextInt(); // num2를 검사해줌 
				if (num2 <= 0) {
					throw new MyException("0 또는 음수로 나눌 수 없습니다"); // throw로 예외발생 
				}
			} catch (MyException e) {
				System.out.println("예상치 못한 오류가 발생하였습니다 ");
				e.printStackTrace();

			}
			System.out.print("나눈 결과 : ");
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("예상치 못한 오류가 발생하였습니다 ");
			e.printStackTrace();

		}

	}
}
