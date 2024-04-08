package final1;

import java.util.HashMap;

public class Board {
	int postId;
	HashMap<Integer, Post> postmap;

	public Board() {
		super();
		this.postId = 0;
		this.postmap = new HashMap<>();
	}

	void addPost(String title, String content) {
//		아이디는 포스트별로 생기는 것
//		아이디 생성하고 (게시물번호) 그에 맞춰 입력받은 타이틀과 내용을 넣어줌 
		Post post = new Post();

		post.setId(this.postId);
		postId++;
		System.out.println("아이디 부여 완료");

		String inputTitle = title;
		post.setTitle(inputTitle);

		String inputContent = content;
		post.setContent(inputContent);

		System.out.println("게시글 작성 완료");
		postmap.put(postId, post);
	}

	void deletePost(int key) throws IllegalArgumentException { // 입력받은 번호를 키값으로 받아서 지우기 Scanner sc = new

		if (!postmap.containsKey(key)) {
			System.out.println("아이디값이 없습니다");
			throw new IllegalArgumentException();
		} else {
			postmap.remove(key);
			System.out.print(key + "번 게시글이 삭제되었습니다! ♥ ♥ ♥ ♥\n");
		}
	}

	void getAllPosts() {
		for (Integer key : postmap.keySet()) {
			String title = postmap.get(key).getTitle();
			String content = postmap.get(key).getContent();
			System.out.println(key + "번 게시물, title :" + title + ", content : " + content + "\n");
		}
	}

	// Board 클래스
	// - 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
	// addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
	// deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
	// 해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
	// getAllPosts(): 모든 게시물을 리스트로 반환
	//

}
