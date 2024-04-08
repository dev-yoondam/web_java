package classTest02;

public class SingerMain {
	public static void main(String[] args) {
		//객체 생성
		Singer s1 = new Singer();
		System.out.println(s1);
		
		s1.title = "노래제목";
		s1.artist = "가수이름";
		s1.album = "앨범명";
		
		s1.artistInfo();
		
	}
}
