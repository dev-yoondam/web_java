package typeCasting;

public class CastingTest01 {
	public static void main(String[] args) {
		// int, long, double, float, boolean, char
		// 기본자료형, 원시자료형, Primitive Type
		
		// String, 클래스..
		//클래스자료형, 참조자료형, Reference Type
		
		//다른 자료형의 값을 문자열 자료형으로 만들기
		// + ""
		//기본자료형 : 10, 10L, 5.3, 5.3f, true, 'c'
		String str1 = 10 + "";
		String str2 = 5.3 + "";
		String str3 = true + "";
		String str4 = 'a' + "";
		System.out.println(str1 + str2);
		
		//문자열을 다른 자료형으로 변환
		int number1 = Integer.parseInt(str1);
		double number2 = Double.parseDouble(str2);
		boolean isTrue = Boolean.parseBoolean(str3);
		System.out.println(number1 + number2);
		char ch = str4.charAt(0);
		System.out.println(ch);
		char ch2 = "hello".charAt(0);
		//index : 문자열을 구성하는 모든 문자들에 부여된 고유번호
		//index의 시작번호는 0부터 시작한다!
		System.out.println(ch2);
		
	}
}












