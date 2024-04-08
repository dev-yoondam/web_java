package array;

public class TwoArrayTest03 {
	public static void main(String[] args) {
		
		int[] ar = {1, 2, 3};
		System.out.println(ar);
		System.out.println(ar[0]);
		
		int[][] ar2 = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(ar2); // 2차원 배열의 시작 주소값
		System.out.println(ar2[0]); //2차원 배열의 0번째행의 시작주소값
		System.out.println(ar2[0][0]);
		
		System.out.println();
//		for(int i = 0; i < ar.length; i++) {
////			System.out.println(i);
//			System.out.println(ar[i]);
//		}

		for(int i = 0; i < ar2.length; i++) {
//			System.out.println(i);
			for(int j = 0; j < ar2[i].length; j++) {
//				System.out.println(j);
				System.out.print(ar2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

















