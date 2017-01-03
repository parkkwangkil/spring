package vo;

public class Article {
	private int num;
	private String writedate;
	private int readCount;
	private String writer;
	private String password;
	private String title;
	private String content;
	private int vote;
	private int add;
	private int depth;

	public Article(int num, String writedate, int readCount, String writer, String password, String title,
			String content, int vote, int add, int depth) {
		super();
		this.num = num;
		this.writedate = writedate;
		this.readCount = readCount;
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		this.vote = vote;
		this.add = add;
		this.depth = depth;
	}

	public Article(String writedate, int readCount, String writer, String password, String title, String content,
			int vote, int add, int depth) {
		super();
		this.writedate = writedate;
		this.readCount = readCount;
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		this.vote = vote;
		this.add = add;
		this.depth = depth;
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public String getWritedate() {
		return writedate;
	}

	public int getReadCount() {
		return readCount;
	}

	public String getWriter() {
		return writer;
	}

	public String getPassword() {
		return password;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getVote() {
		return vote;
	}

	public int getAdd() {
		return add;
	}

	public int getDepth() {
		return depth;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Article [num=" + num + ", writedate=" + writedate + ", readCount=" + readCount + ", writer=" + writer
				+ ", password=" + password + ", title=" + title + ", content=" + content + ", vote=" + vote + ", add="
				+ add + ", depth=" + depth + "]";
	}

}
