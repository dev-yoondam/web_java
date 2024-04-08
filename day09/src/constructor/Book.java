package constructor;

public class Book {
	//필드 : 책제목, 책저자, 가격, 출판년도
	String title;
	String author;
	int price;
	int year;
	
	//생성자 : alt + shift + s + o
	public Book() {

	}
	
	public Book(String title, String author, int price, int year) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	
	//메소드
	//책 이름과 저자를 출력하는 메소드
	void printBook() {
		System.out.println("책 이름은 " + this.title + "이고, "
				+ "책 저자 이름은 " + this.author + "입니다");
	}
	
}



























