package accessModifier2;

import accessModifier.A;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		Child c = new Child();
		
		a.var1 = 9;
		System.out.println(a.var1);
		
		c.method();
		
		System.out.println(a);
		System.out.println(c);
		
	}
}
