package print;

public class PrintTest03 {
	public static void main(String[] args) {
		//서식문자의 옵션
		System.out.println("안녕하세요 500");
		System.out.printf("%s,%d\n", "안녕하세요", 500);
		System.out.printf("%-10.2s,%d\n", "안녕하세요", 500);
		System.out.printf("%-10s,%010d\n", "안녕하세요", 500);
		System.out.printf("%5s\t\t%05d원", "꼬북칩", 2000);
	}
}
