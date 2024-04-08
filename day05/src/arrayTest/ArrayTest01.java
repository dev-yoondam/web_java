package arrayTest;

public class ArrayTest01 {
	public static void main(String[] args) {
		//1) 정수형 배열명 number1 선언하고 크기가 5인 배열 생성
//		자료형[] 배열명 = new 자료형[배열크기];
		int[] number1 = new int[5];
		System.out.println(number1);
		System.out.println(number1[0]);
		System.out.println(number1[1]);
		
		//2) 문자열 배열명 cities 초기값 서울, 부산, 강원, 경기, 제주를 할당
		String[] cities = {"서울", "부산", "강원", "경기", "제주"};
		System.out.println(cities);
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		//3) 실수형 배열명 number2 크기가 3인배열생성하면서 
		//초기값 1.1, 2.2, 3.3 할당
		double[] number2;
//		System.out.println(number2);
		number2 = new double[]{1.1, 2.2, 3.3};
		System.out.println(number2);
		
		//4) 몇칸인지도 모르고 어떤값이 들어갈지도 모를 때
		//자료형[] 배열명 = null;
		char[] data = null;
//		System.out.println(data);
		data = new char[2];
		System.out.println(data);
		System.out.println(data[0]);
		
	}
}





















