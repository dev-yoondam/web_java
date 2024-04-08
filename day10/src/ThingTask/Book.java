package ThingTask;

public class Book extends Things{
	//필드
	String author;

	
	//생성자
	public Book(String name, String author) {
		super(name);
		this.author = author;
	}

	//메소드
	@Override
	void printInfo() {
		System.out.println("책이름 : " + super.name);
		System.out.println("저자 : " + this.author);
	}
}



















