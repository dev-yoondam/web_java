package threadTest;

public class ThreadTest2 {
public static void main(String[] args) {
	MyThread2 mt1 = new MyThread2();
	MyThread2 mt2 = new MyThread2();
	
	Thread t1 = new Thread(mt1, "A");
	Thread t2 = new Thread(mt2, "B");
	
	t1.start();
	t2.start();
	
	// 람다식
	// Runnable 인터페이스는 함수형 인터페이스이다 => 람다식을 활용할 수 있다 
	Runnable r1 = () -> {
		for(int i=0 ; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} System.out.println("쓰레드 종료쓰쓰");
	};
	
	//---------------------------------------
	System.out.println(r1);
	Thread test = new Thread(r1, "C");
	
	test.start();
	//-----------------------------
	Thread t3 = new Thread(() -> {
		for(int i=0 ; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} System.out.println(Thread.currentThread().getName() + "왕 쓰레드 종료");
	}, "C");
	
	t3.start();
	//-----------------------------

}
}
