package inheritanceTest3;

public class Parents {
	//필드
	int number;
	
	//메소드
	void printStr(String str) {
		System.out.println(str);
	}

	//생성자
	public Parents() {
		super();
		System.out.println("Parents 생성자 호출");
	}

	public Parents(int number) {
		super();
		this.number = number;
	}
	
	
}
