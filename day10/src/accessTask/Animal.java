package accessTask;

public class Animal {
	// Animal 클래스
	// 필드 : protected name
	// 생성자 : 매개변수 없는 기본 생성자
	// 메소드 : eat() => 00이가 먹이를 먹습니다 출력

	//필드
	protected String name;
	
	//생성자
	public Animal() {
		super();
	}
	
	//메소드
	void eat() {
		System.out.println(this.name + "이/가 먹이를 먹습니다");
	}
}
