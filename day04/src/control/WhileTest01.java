package control;

public class WhileTest01 {
	public static void main(String[] args) {
		int cnt = 1;
		System.out.println(cnt < 5);
		while (cnt < 6){
			System.out.println("안녕하세요");
//			cnt += 1; 
			System.out.println(cnt++);
//			break;
		}
	}
}
