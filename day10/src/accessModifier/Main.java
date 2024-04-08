package accessModifier;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		//public, default, protected
		//같은 패키지 내에 다른 클래스기 때문에 모두 접근가능
//		a.var1 = 10;
//		a.var2 = 20;
//		a.var3 = 30;
//		
//		System.out.println(a.var1);
//		System.out.println(a.var2);
//		System.out.println(a.var3);
		
		//같은 패키지 내에 다른 클래스에 있는 메소드
		//public, default, protected 접근 가능
		a.publicMethod();
		a.proMethod();
		a.defaultMethod();
		
		System.out.println(a.getVar4());
		a.setVar4(40);
		System.out.println(a.getVar4());
		
	}
}


















