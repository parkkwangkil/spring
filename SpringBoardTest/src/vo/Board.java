package vo;

import java.util.Date;

public class Board {
	private int boardNum;
	private String id;
	private String subject;
	private String content;
	private String writer;
	private int readcount;
	private Date date;

	public Board() {
	}

	public Board(int boardNum, String id, String subject, String content, String writer, int readcount, Date date) {
		super();
		this.boardNum = boardNum;
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.readcount = readcount;
		this.date = date;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", id=" + id + ", subject=" + subject + ", content=" + content
				+ ", writer=" + writer + ", readcount=" + readcount + ", date=" + date + "]";
	}

}