package classTest02;

public class MarvelMain {
	public static void main(String[] args) {
		MarvelHero ironMan = new MarvelHero("아이언맨", "에너지빔", 20);
		System.out.println(ironMan);
		
		MarvelHero hulk = new MarvelHero();
		System.out.println(hulk);
		
		ironMan.name = "아이언맨";
		ironMan.superpower = "에너지 빔";
		ironMan.age = 40;
		
		hulk.name = "헐크";
		hulk.superpower = "근력파워";
		hulk.age = 35;
		
		ironMan.heroInfo();
		hulk.heroInfo();
		
		hulk.performAction();
		
		
	}
}
