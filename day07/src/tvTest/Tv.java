package tvTest;

public class Tv {
	//필드 
	//tv 채널, 볼륨, 전원, 가격, 색상
	int ch;
	int vol;
	boolean power;
	int price;
	String color;
	
	//메소드
	void powerOnOff() {
		if(!power) {
			System.out.println("tv 전원을 킵니다");
		}else {
			System.out.println("tv 전원을 끕니다");
		}
	}
	
	void chUp() {
		if(!power) {
			System.out.println("현재 채널 : " + ch);
			ch++;
			System.out.println("채널을 1 올립니다. 현재채널 : " + ch);
		}else {
			System.out.println("tv 전원을 먼저 켜야합니다");
		}
	}
}





