package final1;

public class Post {
	private int id; // 게시글 고유번호
	private String title; // 게시글 제목
	private String content; // 게시글 내용

	// 기본생성자
	public Post() {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

//getter
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

//setter
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	void getInfo() {
		System.out.println(id + ", " + title + ", " + content);

	}

}
