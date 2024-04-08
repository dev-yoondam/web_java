package review;

public class Tv {
	//필드
	int ch;
	int vol;
	boolean power;
	String color;
	
	//메소드
	void powerOnOff() {
		System.out.println("Tv 전원을 켜고 끕니다.");
	}
	
	void chUp() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널을 1올립니다. " + ++ch);
	}
	
	void chDown() {
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널을 1내립니다. " + --ch);
	}

	
	//생성자 : alt + shift + s + o
	//생성자 오버로딩 : 같은 이름의 생성자로 매개변수의
	//타입, 개수, 순서가 다르면 선언이 가능하다
	public Tv() {
		
	}
	
	public Tv(int vol, int ch, boolean power) {
		this(power, ch, vol);
	}
	
				//10, 		20, 		true, 	
	public Tv(boolean power, int ch, int vol) {
		System.out.println(this);
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = "gray";
	}


	public Tv(boolean power, int ch, int vol, String color) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}
	
	
	
	
	
	
	
}






















