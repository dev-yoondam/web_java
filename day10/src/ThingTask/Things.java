package ThingTask;

public class Things {
	   //필드 이름
	   //생성자 매개변수1
	   //메소드 printInfo : 이름을 출력
	

	//필드
	String name;

	
	//생성자
	public Things(String name) {
		super();
		this.name = name;
	}

	//메소드
	void printInfo() {
		System.out.println("이름 : " + this.name);
	}
	
	
}
