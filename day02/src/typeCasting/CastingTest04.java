package typeCasting;

public class CastingTest04 {
	public static void main(String[] args) {
		//강제형변환 : (자료형)값
		
		int num1 = (int)5.24; //강제형변환
		System.out.println(num1);
		
		double num2 = 5; //자동형변환
		System.out.println(num2);
		
		char ch1 = 97; //자동형변환
		System.out.println(ch1);
		
		System.out.println((int)'나'); //45208
		char ch2 = 44032;
		System.out.println(ch2);
		
	}
}
