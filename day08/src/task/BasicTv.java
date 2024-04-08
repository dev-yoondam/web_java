package task;

public class BasicTv {
	//필드
	String color;
	int inch;
	int price;
	boolean power; //ture : on, false : off
	int channel = 1;
	
	//매개변수 3개 받는 생성자(색상, 인치, 가격)
	public BasicTv(String color, int inch, int price) {
		this.color = color;
		this.inch = inch;
		this.price = price;
	}

		
	//매개변수 4개 받는 생성자(색상, 인치, 가격, 채널)
	public BasicTv(String color, int inch, int price, int channel) {
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}
	
	//메소드
	//전원 켜는 메소드 powerOnOff() 매개변수 x, 리턴값 x
	void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("tv 전원이 켜졌습니다");
		}else {
			System.out.println("tv 전원이 꺼졌습니다");
		}
	}
	
	//채널올리는 메소드 channelUp() 매개변수 x, 리턴값 o
	int channelUp() {
		return ++channel;
	}
	
	//채널내리는 메소드 channelDown() 매개변수 x, 리턴값 o
	int channelDown() {
		return --channel;
	}
	
}




















