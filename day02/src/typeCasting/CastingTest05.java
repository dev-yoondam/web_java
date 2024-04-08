package typeCasting;

public class CastingTest05 {
	public static void main(String[] args) {
		//정수형 int
		int iNum = 10;
		System.out.println(iNum);
		long lNum = 10; //자동형변환
		System.out.println(lNum);
		double dNum = 10; //자동형변환
		System.out.println(dNum);
		float fNum = 10; //자동형변환
		System.out.println(fNum);
		char cNum = 65;
		System.out.println(cNum);
//		boolean bNum = (boolean)10; //boolean 타입의 저장공간에 정수형 값 저장 불가능
//		System.out.println(bNum);
		
		//정수형 long
		long lNum2 = 10L;
		//int타입의 저장공간에 long 타입의 값을 넣을 때는 강제형변환만 가능
		int iNum2 = (int)10L;
		double dNum2 = 10L; //자동형변환 가능
		float fNum2 = 10L; //자동형변환 가능
		//char타입의 저장공간에 long 타입의 값을 넣을 때는 강제형변환만 가능
		char cNum2 = (char)65L;
		System.out.println(cNum2);
//		boolean bNum2 = (boolean)10L; // boolean 타입의 저장공간에는 다른 타입의 값을 저장할 수 없다
		
		//실수형 double
		double dNum3 = 10.5;
		System.out.println(dNum3);
		int iNum3 = (int)10.5; //정수형의 저장공간에 실수형 값을 저장시에는 강제형변환
		System.out.println(iNum3);
		long lNum3 = (long)10.5; //정수형의 저장공간에 실수형 값을 저장시에는 강제형변환
		System.out.println(lNum3);
		float fNum3 = (float)10.5; //float 저장공간에 double 값을 저장시 강제형변환
		char cNum3 = (char)65.0; //강제형변환
		System.out.println(cNum3);
//		boolean bNum3 = (boolean)10.5;
		
		//실수형 float
		float fNum4 = 10.5f;
		int iNum4 = (int)10.5f;
		long lNum4 = (long)10.5f;
		double dNum4 = 10.5f;
		char cNum4 = (char)65.0f;
//		boolean bNum4 = (boolean)10.0f;
		
		//문자형 char
		char cNum5 = 'b';
		System.out.println((int)cNum5); //강제형변환 문자형 -> 정수형
		int iNum5 = (int)'b'; //int 타입으로 변환시 강제형변환
		long lNum5 = 'b'; //long 타입으로 변환시 자동형변환
		System.out.println(lNum5);
		float fNum5 = 'b';
		System.out.println(fNum5);
		double dNum5 = 'b';
//		boolean bNum5 = (boolean)'b';
		
		//논리형 boolean
		boolean bNum6 = true;
//		int iNum6 = (int)true;
//		long lNum6 = (long)true;
//		float fNum6 = (float)true;
//		double dNum6 = true;
	}
}












