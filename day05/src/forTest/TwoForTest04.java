package forTest;

public class TwoForTest04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //바깥for : i가 1부터 5까지 반복
			for(int j = 1; j <= 3; j++) { //안쪽for : j가 1부터 3까지 반복
//				System.out.print("i = " + i + ", j = " + j);	
				System.out.print("* ");//별표와 공백을 번갈아하면서 출력
			}
			System.out.println();
			
		//바깥for문에서 i는 1부터 5까지 반복
		//안쪽for문에서 j는 1부터 3까지 반복
		//	i가 1일때 j는 1부터 3까지 반복하므로 출력되는 문장은 별표와 공백을 번갈아가면서 출력
		//	별표가 3개씩 출력
		//한줄 출력이 끝나면(한 행이 끝나면) 바깥 for문으로 이동하므로 다음줄로 넘어갈수있도록
			//줄바꿈 출력
		//바깥for문의 조건문이 false가 되면 반복문 종료한다
		}
	}
}
