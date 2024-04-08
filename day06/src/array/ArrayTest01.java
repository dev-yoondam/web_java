package array;

public class ArrayTest01 {
	public static void main(String[] args) {
		//배열 선언 후 1~10까지 값 넣기
//		int[] ar1 = new int[10];
//		System.out.println(ar1);
		
		//배열에 값을 대입하는 반복문
//		for(int i = 0; i < ar1.length; i++) {
//			ar1[i] = i + 1;
//		}
		
		//배열에 값을 출력하는 반복문
//		for(int i = 0; i < ar1.length; i++) {
//			System.out.println(ar1[i]);
//		}
		
		//1부터 10까지의 값을 배열 넣고 총 합 구하기
		//칸 수만 알고있을 때 배열 생성
		int[] ar2 = new int[10];
		
		//1) 총합 저장할 변수 선언
		//2) 반복문(for문 배열의 값을 넣어줄 반복문) - 값 대입, 확인용 출력
		//3) 반복문(for문 총합을 구할 반복문) - 값 대입(배열에 저장된 값을 총합 변수)
		//4) 출력
		
		int total = 0;
		for(int i = 0; i < ar2.length; i++) {
//			ar2[i] = i+1;
//			ar2[i] = ar2.length - i; //인덱스0부터 값이 10, 인덱스1 값이 9 ,.. 인덱스9 값이 1
			//i의 값 : 0~9
			ar2[ar2.length - 1 - i] = ar2.length - i;
		}

		for(int i = 0; i < ar2.length; i++) {
			total += ar2[i];
		}
		System.out.println(total);
		
		
	}
}














