package accessModifier2;

import accessModifier.A;

public class Child extends A{
	//필드
	int num;
	
	//메소드
	void method() {
		var1 = 100; //var1은 접근제한자 public이기 때문에 모든 곳에서 사용가능
//		var2 = 200; //var2는 접근제한자 default기 때문에 다른 패키지에서 사용불가
		var3 = 15; //var3는 접근제한자 protected기 때문에 다른 패키지에서 사용불가능 하지만
//		상속관계에 있는 자식 클래스이기 때문에 사용가능
		System.out.println(var1);
		System.out.println(var3);
	}
}
