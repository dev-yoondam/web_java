package markerTest;

public class MarkerInterMain {
	public static void main(String[] args) {
		SomeClass sc1 = new SomeClass("데이터");
		
		if(sc1 instanceof MarkerInterface) {
			System.out.println("sc1은 MarkerInterface를 구현한 클래스 입니다");
		}else {
			System.out.println("sc1은 MarkerInterface를 구현하지 않은 클래스 입니다");
		}
	
	}
}
