package animalTest;

public class AnimalMain {
	public static void main(String[] args) {

		//객체 2개 생성하고 메소드 호출
		Animal cat = new Animal();
		cat.printAnimal();
		
		Animal dog = new Animal("멍멍이", 2, "골든리트리버");
		System.out.println(dog.eat("개껌"));

	}
}
