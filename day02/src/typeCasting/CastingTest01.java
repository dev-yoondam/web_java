package typeCasting;

public class CastingTest01 {
	public static void main(String[] args) {
		//자동형변환
		//정수(int 4) 값 -> 정수(long 8) 저장공간
		int iNum = 3;
		long lNum = iNum;
		//대입연산자 오른쪽에 있는 변수명은 값으로 해석할 수 있어야한다!
		System.out.println(iNum);
		System.out.println(lNum);
		
		//정수(long 8) 값 -> 정수(int 4) 저장공간 => 자동형변환 불가
		long lNum2 = 3L;
//		int iNum2 = lNum2; 강제형변환으로 가능하다
		
		//실수(float 4) 값 -> 실수(double 8) 저장공간
		float fNum1 = 3.14f;
		double dNum1 = fNum1;
		System.out.println(fNum1); //float
		System.out.println(dNum1); //double 소수점 15자리
		
		//실수(double 8) 값 -> 실수(float 4) 저장공간 => 자동형변환 불가
		double dNum2 = 3.14;
//		float fNum2 = dNum2;
		
		
		
	}
}
