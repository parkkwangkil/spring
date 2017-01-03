package vo;

import java.util.Date;

public class Article {
	private int articleNum;
	private String title;
	private String content;
	private String writer;
	private int readCount;
	private Date writeDate;

	public Article() {
	}

	public Article(int articleNum, String title, String content, String writer, int readCount, Date writeDate) {
		super();
		this.articleNum = articleNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.readCount = readCount;
		this.writeDate = writeDate;
	}

	public int getArticleNum() {
		return articleNum;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public int getReadCount() {
		return readCount;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "Article [articleNum=" + articleNum + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", readCount=" + readCount + ", writeDate=" + writeDate + "]";
	}

}
