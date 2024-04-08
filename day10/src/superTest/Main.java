package superTest;

public class Main {
	public static void main(String[] args) {
		Parents p1 = new Parents(100);
		System.out.println(p1);
		System.out.println(p1.pVal);
		
		
		System.out.println("===================");
		Child c1 = new Child(200, 22);
		System.out.println(c1);
		System.out.println(c1.pVal);
		System.out.println(c1.chVal);
		c1.chMethod1();
	}
}
