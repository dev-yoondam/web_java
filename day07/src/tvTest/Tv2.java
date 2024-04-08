package tvTest;

public class Tv2 {
	//필드
	int ch;
	int vol;
	boolean power;
	String color;

	//생성자
	public Tv2(int ch, int vol, boolean power, String color) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}
	
	//메소드
	void power() {
		if(power) {
			System.out.println("tv 전원을 킵니다");
		}else {
			System.out.println("tv 전원을 끕니다");
		}
	}
}








