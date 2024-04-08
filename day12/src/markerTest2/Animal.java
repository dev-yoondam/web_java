package markerTest2;

public class Animal {
	//필드
	private String name;

	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}

	//게터메소드
	public String getName() {
		return name;
	}
	
	//메소드
	public void eat() {
		System.out.println(this.name + "이(가) 먹는중입니다");
	}
	
	
}
