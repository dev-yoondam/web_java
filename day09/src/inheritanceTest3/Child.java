package inheritanceTest3;

public class Child extends Parents{
	//필드
	int number;
	
	//메소드
	void printInt(int num) {
		System.out.println(num);
	}

	//생성자
	public Child() {
		super();
		System.out.println("Child 생성자 호출");
	}

	public Child(int number) {
		super();
		this.number = number;
	}
	
}

















