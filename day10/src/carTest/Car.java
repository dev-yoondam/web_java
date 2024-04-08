package carTest;

public class Car {
	// 필드
	// 브랜드, 색상, 가격
	String brand;
	String color;
	int price;

	// 메소드
	// enginStart : 시동이 켜졌습니다 출력(매개변수x, 리턴값x)
	// enginStop : 시동이 꺼졌습니다 출력(매개변수x, 리턴값x)
	void enginStart() {
		System.out.println(this.brand + "시동이 켜졌습니다");
	}

	void enginStop() {
		System.out.println("시동이 꺼졌습니다");
//		System.out.println(super.toString());
//		System.out.println(this.toString());
//		System.out.println(this);
	}

	// 생성자 : alt + shift + s + o
	// 기본생성자
	// 매개변수 3개 있는 생성자
	public Car() {
		super();
	}

	public Car(String brand, String color, int price) {
		super();
		System.out.println(super.toString());
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

}






























