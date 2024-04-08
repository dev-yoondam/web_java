package final1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		HashMap<Integer, Post> p = new HashMap<>();

		Post post = new Post();
		Board board = new Board();

		board.addPost("제목", "내용");
		board.addPost("제목2", "내용2");
		board.addPost("제목3", "내용3");
		board.addPost("제목4", "내용4");
		board.addPost("제목5", "내용5");
		board.addPost("제목6", "내용6");

		board.getAllPosts();

		try {
			board.deletePost(100);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println();
		board.getAllPosts();

	}

}

//Main 클래스
//- 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
