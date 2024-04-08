package print;

public class PrintTask {
	public static void main(String[] args) {
//		실습1 문자열을 수정하여 실행결과처럼 출력하세요 이스케이프 문자 
		System.out.print("봄\n\t여름\n가을\n\t겨울");

//		실습2
//		문자열타입 weather, 값은 맑음
//		정수형타입 month, 월
//		정수형타입 date, 일
//		실수형타입 max => 10.5253
//		실수형타입 min => 5.2535
//+		문자형 타입 요일
		String weather = "맑음";
		int month = 3, date = 11;
		double max = 10.5253;
		double min = 5.2535;
		char day = '월';
		
//		변수를 이용해서 printf 값을 출력
//		월 일의 최고 기온은 00.00입니다
		System.out.printf("\n%d월 %d일의 최고기온은 %.2f입니다", month, date, max);
//		월 일의 최저 기온은 00.000입니다
		System.out.printf("\n%d월 %d일의 최저기온은 %.3f입니다", month, date, min);
//		오늘의 날씨는 "맑음"입니다
		System.out.printf("\n오늘의 날씨는 %s입니다", weather);
//+		월 일 요일의 날씨는 맑음입니다로 출력
		System.out.printf("\n%d월 %d일 %c요일의 날씨는 %s입니다", month, date, day, weather);
	}
}




