package threadTest;

public class Test implements Runnable {
	private int number;

	public Test() {
		super();
		this.number = 100;
	}

	@Override
	public /*synchronized*/ void run() { 
		// run 메소드에서 동기화처리 : 단일쓰레드로 작동된다 
		for (int i = 0; i < 5; i++) {
			sub(10);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

//	public void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + " : -" + number);
//		System.out.println("현재 number :" + this.number + "\n");
//	}
//	
	
	
//	//sub 메소드에 동기화 키워드 붙임 -> 동기화 메소드로 바뀜 
//	public synchronized void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + " : -" + number);
//		System.out.println("현재 number :" + this.number + "\n");
//	}
	
	// 동기화 블록 이용 
	public void sub(int number) {
		String name = Thread.currentThread().getName();
		synchronized(this) {
		this.number -= number; //< - - 여기가 동기화돼야함
		}
		System.out.println(name + " : -" + number);
		System.out.println("현재 number :" + this.number + "\n");
	}

}
