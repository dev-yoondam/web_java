package thisTest;

class Car{
	//필드
	String brand;
	String color;
	int price;
	
	//메소드
	void carInfo() {
		System.out.println(this.brand + "의 색깔은 " + this.color + "입니다");
	}
	
	//생성자
	public Car() {
		this("벤틀리", "red", 50000);
	}

	public Car(String brand, String color) {
		this(brand, color, 10000);
		System.out.println("생성자 실행");
//		this.brand = brand;
//		this.color = color;
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}


public class ThisTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("BMW", "White");
		Car car3 = new Car("KIA", "Black", 2000);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car2.price);
		
	}
}

















