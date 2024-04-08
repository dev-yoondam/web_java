package fanTest;

public interface Fan {
	//상수
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;

	//추상메소드
	void on();
	void off();
	void turbo();
	
	//Fan 인터페이스를 구현한 클래스 3개
	//1. BasicFan 클래스
	//버튼으로 전원켜기, 버튼으로 전원끄기, turbo는 비워둔다
	
	//2. BasicFan2 클래스
	//리모컨으로 전원켜기, 리모컨으로 전원끄기, turbo는 터보 출력
	
	//3. SmartFan 클래스
	//음성인식으로 전원켜기, 음성인식으로 전원끄기, turbo는 터보 출력
	
	
}
