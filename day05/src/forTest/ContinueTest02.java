package forTest;

public class ContinueTest02 {
	public static void main(String[] args) {
		//1부터 10까지 5를 제외하고 출력하기
		// 반복문(for 초기식 int i = 0; 조건식 i < 10; 증감식 i++)
		// 조건문(if 조건식 i == 4)
		// 출력(i+1)
		
		for(int i = 0; i < 10; i++) {
			if(i==4) {
//				continue;
				break;
			}
			System.out.println(i+1);
		}
	}
}










