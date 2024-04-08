package whileTest;

public class WhileTest02 {
	public static void main(String[] args) {
		//1부터 100까지의 짝수의 합 출력(while문)
		
		//로직구성
		//1) 변수 선언(카운트, 총합)
		//2) 반복문(while){
//		 	출력 카운트변수
		//3) 조건문(if (카운트 % 2 == 0)){
		//4) 총합 구할 변수 += 카운트 }
		//5) 카우트 변수 증가
		//6) 출력
		
		int cnt = 1, even = 0;
		while (cnt <= 100 ) {
//			System.out.println(cnt);
			if (cnt % 2 == 0) {
				even += cnt;
			}
			cnt++;
		}
		System.out.println(even);		
	}
}












