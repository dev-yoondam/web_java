package ThingTask;

public class Main {
	public static void main(String[] args) {
		Things things = new Things("물건");
		Book book = new Book("자바프로그래밍", "개발자");

		System.out.println(things);
		System.out.println(book);
		things.printInfo();
		book.printInfo();

//		A a = new A(10, 20);
//		a.method1(10, 30);
	}
}

//class A{
//	//필드
//	int num1;
//	int num2;
//	
//	//생성자
//	public A(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}
//	
//	//메소드
//	void method1(int num1, int num2) {
//		System.out.println(num1 + num2);
//	}
//	void method1(int num1, double num2) {
//		System.out.println(num1 + num2);
//	}
//}
