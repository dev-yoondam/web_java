package arrayTest;

public class ArrayTest02 {
	public static void main(String[] args) {
		//어떤 값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};
		System.out.println(ar1); //참조값
		System.out.println(ar1[0]); //0번째 저장공간에 저장된 값
		System.out.println(ar1[4]);
		
		//몇칸 만들지만 알 때
		int[] ar2 = new int[3];
		System.out.println(ar2); //참조값
		System.out.println(ar2[0]); //초기값
		System.out.println(ar2[1]); //초기값
		System.out.println(ar2[2]); //초기값
		
		ar2[0] = 10;
		ar2[1] = 20;
		ar2[2] = 30;
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		//배열의 길이 확인 : 배열명.length
		System.out.println(ar2.length);
		
		System.out.println(ar1.length);

		int[] arData = {4, 2, 3, 1};
//		int number = arData; 
		
	}
}










