package inheritanceTest;

public class SmartTv {
	// 스마트 Tv 				SmartTv
	// 필드
	int ch;
	int vol;
	boolean power;

	// 메소드
	// 채널Up, 채널Down
	void chUp() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("채널을 올립니다 : " + ++ch);
	}

	void chDown() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("채널을 올립니다 : " + --ch);
	}

	// 볼륨Up, 볼륨Down
	void volUp() {
		System.out.println("현재 볼륨 : " + vol);
		System.out.println("볼륨을 올립니다 : " + ++vol);
	}

	void volDown() {
		System.out.println("현재 볼륨 : " + vol);
		System.out.println("볼륨을 올립니다 : " + --vol);
	}

	// 전원OnOff
	void powerOnOff() {
		if (!power) {
			System.out.println("Tv를 켰습니다");
		} else {
			System.out.println("Tv를 껐습니다");
		}
	}
	
	//netflix 메소드
	void netflix() {
		System.out.println("netflix 모드를 켰습니다");
	}
}














