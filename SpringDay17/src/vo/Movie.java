package vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Movie {
	private String title;
	private List<MultipartFile> myfile;

	public Movie() {
	}

	public String getTitle() {
		return title;
	}

	public List<MultipartFile> getMyfile() {
		return myfile;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMyfile(List<MultipartFile> myfile) {
		this.myfile = myfile;
	}

}
