package markerTest2;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
//		m.checkA(new Eagle("독수리"));
//		m.checkA(new Tiger("호랑이"));
//		m.checkA(new Horse("말"));
		
		Animal[] animals = {new Eagle("독수리"), new Tiger("호랑이"),  new Horse("말") };
//		System.out.println(animals);
		
		m.checkB(animals);

	}
	
	void checkA(Animal animal) {
		if(animal instanceof Carnivore) {
			System.out.println(animal.getName() + "은/는 육식동물입니다");
		}else if(animal instanceof Herbivore) {
			System.out.println(animal.getName() + "은/는 초식동물입니다");
		}
	}
	
	void checkB(Animal[] animals) {
		for(int i = 0; i < animals.length; i ++) {
			if(animals[i] instanceof Land) {
				System.out.println(animals[i].getName() + "은/는 뛰어다닙니다");
			}else if(animals[i] instanceof Sky) {
				System.out.println(animals[i].getName() + "은/는 날아다닙니다");
			}
		}
	}
}

















