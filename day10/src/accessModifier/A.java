package accessModifier;

public class A {
	//필드
	public int var1 = 1;
	int var2 = 2; //(default) 
	protected int var3 = 3;
	private int var4 = 4;

	//생성자
	public A() {
		super();
	}
	
	//메소드
	public void publicMethod() {
		System.out.println("public메소드 호출");
	}
	
	void defaultMethod() {
		System.out.println("default메소드 호출");
	}
	
	protected void proMethod() {
		System.out.println("protecte메소드 호출");
	}

	//게터, 세터 단축키 : alt + shift + s + r
	//세터 var4 필드에 값을 넣어줄 때 사용(setter메소드)
	public void setVar4(int var4) {
		this.var4 = var4;
	}
	
	//게터 var4 필드에 값을 사용해야할 때 사용(getter메소드)
	public int getVar4() {
		return var4;
	}
}











