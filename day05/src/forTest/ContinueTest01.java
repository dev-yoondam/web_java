package forTest;

public class ContinueTest01 {
	public static void main(String[] args) {
		//1부터 100까지의 합 출력
		//1) 총합 구할 변수
		//2) for(초기식 : int i = 1; 조건식 : i <= 100; 증감식 : i++){
		//3)	총합 변수 += i }
		//4) 출력
		
		int total = 0;
		for(int i = 1; i <= 100; i++) {
//			total += i;
			if(i % 2 == 0) {
				continue;
			}
			total += i;
//			System.out.println(i);
		}
		System.out.println("1부터 100까지의 홀수의 총합 : " + total);
	}
}













