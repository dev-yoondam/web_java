package castingTest3;

public class Dog extends Animal {

	// 메소드
	// 메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("멍멍!!");
	}

	void walk() {
		System.out.println("산책가자!");
	}

	// 생성자
	public Dog(String name) {
		super(name);
	}

}

























