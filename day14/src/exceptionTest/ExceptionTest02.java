package exceptionTest;

public class ExceptionTest02 {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		ExceptionTest02 et = new ExceptionTest02();
		et.printLength("dataType");
		et.printLength(null);

		System.out.println("프로그램 종료");

	}

	// 메소드
	public void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("data의 문자 개수 : " + result);
		}catch(NullPointerException e) {
			//예외 정보를 얻는 3가지 방법
			//1.
//			System.out.println(e.toString()); //예외 종류, 발생이유 리턴
			//2.
//			System.out.println(e.getMessage()); //예외 발생이유 리턴
			//3.
			e.printStackTrace(); //예외가 어디서 발생했는지 추적한 내용까지 출력
			
			System.out.println("null값은 개수를 셀수없습니다");
		}finally {
			System.out.println("예외처리 끝");
		}
	}
}
























