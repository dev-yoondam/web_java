package typeCasting;

public class TypeTask {
	public static void main(String[] args) {
		//1. 올해 년도, 월, 일을 정수형타입의 변수로 만들고
		//올해는 0000년, 0월, 0일 입니다 형태로 출력하기
		
//		변수선언(정수형 변수 3개)
//		출력(변수 + 연결)
		int year = 2024, month = 3, date = 12;
		System.out.println("올해는 " + year + "년, " + month + "월, " + date + "일입니다");
		
		//2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
		//24라는 값만 출력하기
		
//		문자열타입 year2 변수(값 year + "")
//		문자형타입 변수(2개 index2, index3 저장) charAt()
//		출력
		String year2 = year + "";
		System.out.println(year2);
		char ch1 = year2.charAt(2);
		char ch2 = year2.charAt(3);
//		System.out.print(ch1);
//		System.out.print(ch2);
		System.out.printf("%c%c", year2.charAt(2), year2.charAt(3));
		
		//3. 1번에서 만든 변수들중 월, 일을 문자열로 바꿔서
		// result 변수에 저장하고 실수(3.12)로 변환하여 출력하기
		
//		변수 2개선언(String 타입)
//		변수선언(변수명 result 타입 String 값 문자열)
//		실수로 Double.parseDouble(result)
		
		String month1 = month + ".";
		String date1 = date + "";
		System.out.println("\n"+month1 + date1);
		String result1 = month1 + date1;
		Double result = Double.parseDouble(result1);
		System.out.println(result);
		
	}
}














