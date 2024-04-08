package carTest;

public class CarMain {
	public static void main(String[] args) {
		//부모 클래스의 객체 
//		Car c1 = new Car();
//		Car c2 = new Car("벤틀리", "red", 4000);
		
		//자식 클래스의 객체
//		System.out.println(sc1.booster);
//		SuperCar sc1 = new SuperCar(true);
//		System.out.println(sc1.booster);
		SuperCar sc2 = new SuperCar("기아", "blue", 5000, true);
	
//		System.out.println(c2);
		System.out.println(sc2);
//		c2.enginStart(); //부모클래스(슈퍼클래스) 객체
//		sc2.enginStart(); //자식클래스(서브클래스) 객체
//		
//		c2.enginStop();
//		sc2.enginStop();
////		System.out.println(c2);
//		System.out.println(sc2);
	}
}














