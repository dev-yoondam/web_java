package construtorTest;

class B{
	//필드
	int num;
	
	//메소드
	void printNum(int num) {
		System.out.println("매개변수 num : " + num);
		System.out.println("필드 num : " + this.num);
		System.out.println("참조값 : " + this);
	}

	
	//생성자
	public B(int num) {
		this.num = num;
	}

	public B() {

	}
	
}

public class ClassTest2 {
	public static void main(String[] args) {
		//객체화작업
		B b1 = new B();
		System.out.println(b1);
		b1.printNum(10);
		System.out.println(b1.num);
		B b2 = new B();
		b2.num = 100;
		b2.printNum(5);
		System.out.println(b2);
	}
}
















