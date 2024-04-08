package accessTask;

public class Cat extends Animal {
	// Cat클래스
	// Animal 클래스를 상속받는 클래스
	// 필드 : private 색상(color)
	// 생성자 : 매개변수 없는 기본 생성자
	// 메소드 : play(매개변수 x, 리턴값 x) => 00색 고양이 00이가 놀고있습니다 출력
	// scratch(매개변수x, 리턴값x) => 00이가 스크래치를 긁습니다 출력
	
	//필드
	private String color;

	//생성자
	public Cat() {
		super();
	}
	
	//메소드
	private void play() {
		System.out.println(this.color + "색 고양이 " + this.name + "이가 놀고있습니다");
	}
	
	
	
	void scratch() {
		play();
		System.out.println(this.name + "이가 스크래치를 긁습니다");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}












