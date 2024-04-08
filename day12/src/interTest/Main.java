package interTest;

public class Main {
	public static void main(String[] args) {
//		Inter inter = new Inter();
		ClassA ca = new ClassA();
		ca.method1();
		ca.method2();
//		ca.VAR1 = 100;
		System.out.println(ca.VAR1);
		System.out.println(ca.VAR2);
		
		Inter inter = new ClassA(); //업캐스팅
		inter.method1(); //업캐스팅된 객체의 메소드 호출시 오버라이딩 된 결과로 출력된다
		inter.method2();
		
		
	}
}
