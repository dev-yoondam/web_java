package castingTest3;

public class Animal {
	//필드
	int age;
	String name;
	
	//메소드 
	//반드시 자식클래스에서 재정의 해야한다!
	void crying() {
		System.out.println("운다");
	}

	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
}
