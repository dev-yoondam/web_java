package carTest;

//	SuperCar : 자식클래스, 서브클래스
// 	Car	: 부모클래스, 슈퍼클래스
//	extends : 상속관계를 구현하기 위해 쓰는 키워드
public class SuperCar extends Car {
	// 부모클래스 멤버 -> 생성자에 super()라는 부모클래스의 생성자를
	// 호출하는 부분이 있기 때문에 부모클래스 멤버를 사용할 수 있다

	// 필드
	boolean booster;

	// 메소드
	// boosterOn : 부스터 On 출력(매개변수 x, 리턴값 x)
	// boosterOff : 부스터 Off 출력(매개변수 x, 리턴값 x)
	void boosterOn() {
		System.out.println("부스터 On 출력");
	}

	void boosterOff() {
		System.out.println("부스터 Off 출력");
	}
	

	//메소드 오버라이딩 : alt + shift+ s + v

	@Override
	void enginStart() {
//		super.enginStart();
		System.out.println(" 시동 on!!");
	}

//	@Override
//	void enginStop() {
//		System.out.println(super.toString());
//		System.out.println(this.toString());
//		System.out.println(this);
//	}

	// 생성자
	// 매개변수를 4개 받는 생성자
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		System.out.println(super.toString());
		this.booster = booster;

	}

	// 매개변수를 1개 받는 생성자
	public SuperCar(boolean booster) {
		this.booster = booster;
	}

}

































