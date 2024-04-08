package markerTest2;

//육식동물
public class Carnivore extends Animal {

	//생성자	
	public Carnivore(String name) {
		super(name);
	}
	
	//메소드
	public void hunt() {
		System.out.println(getName() + "이(가) 사냥을 합니다");
	}

}
