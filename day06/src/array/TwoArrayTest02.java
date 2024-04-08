package array;

public class TwoArrayTest02 {
	public static void main(String[] args) {
		
		int[][] ar1 = new int[2][3];
		int num = 10;
		
		for(int i = 0; i < ar1.length; i++) {
//			System.out.println(i);
			for(int j = 0; j < ar1[i].length; j++) {
//				System.out.println(j);
//				System.out.println("i = " + i + ", j = " + j);
				
				ar1[i][j] = num;
				num += 10;
			}
		}
		
		//출력용 for문
		for(int[] data : ar1) {
			for(int data2 : data)
			System.out.println(data2);
		}
	}
}










