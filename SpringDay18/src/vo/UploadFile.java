package vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
	private List<MultipartFile> fileList;
	
	public List<MultipartFile> getFileList(){
		return fileList;
		
	}

	public void setFileList(List<MultipartFile> fileList) {
		this.fileList = fileList;
	}
	
}
