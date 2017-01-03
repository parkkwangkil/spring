package vo;

import org.springframework.web.multipart.MultipartFile;

public class Book {
	private String title;
	private MultipartFile myfile;

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public MultipartFile getMyfile() {
		return myfile;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMyfile(MultipartFile myfile) {
		this.myfile = myfile;
	}

}
