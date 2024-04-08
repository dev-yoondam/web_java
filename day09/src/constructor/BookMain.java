package constructor;

public class BookMain {
	public static void main(String[] args) {
		//Book 클래스의 객체
		Book book1 = new Book();
		book1.title = "자바의 신";
		book1.author = "자바";
		book1.price = 20000;
		book1.printBook();
		
		Book book2 = new Book("자바프로그래밍", "개발자", 33000, 2024);
		book2.printBook();
		
		System.out.println(book1.price + "원");
		System.out.println(book2.price + "원");
		
		
	
		BookMain bm = new BookMain();
		System.out.println(bm);
//		System.out.println(book1);
		
		//객체마다의 가격 배열
//		int[] prices = {book1.price, book2.price};
//		System.out.println(bm.totalPrice(prices));//매개변수 o, 리턴값 o
		
	
		System.out.println(bm.totalPrice2(book1, book2) + "원");
	}
	
	
	//객체마다의 가격의 총합을 구하는 메소드
	//매개변수 o, 리턴값 o
//	int totalPrice(int[] prices) {
//		//총합 저장할 변수선언
//		//반복문(for~each) {
//		//총합 변수 += for~each문 변수
//		//}
//		//return 총합변수
//		int total = 0;
//		for(int price: prices ) {
//			total += price;
//		}
//		return total;
//	}

	//객체마다의 가격의 총합을 구하는 메소드
	int totalPrice2(Book... books) {
		//총 가격을 구할 변수 선언
		int total = 0;
		//반복문(for~each문)
		for(Book book : books) {
			total += book.price;
		}
		return total;
	}




}






























