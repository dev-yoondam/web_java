package test;

public class Test2 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("쓰레드 실행 : " + i);
			}
		});
		
		thread.start();
	}
}
