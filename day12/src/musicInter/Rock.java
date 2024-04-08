package musicInter;

public class Rock implements Music{

	@Override
	public void mode() {
		System.out.println("락 모드");
	}

	public void onlyRock() {
		System.out.println("락만 실행");
	}
}
