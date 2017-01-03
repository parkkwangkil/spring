package vo;

public class Myfile {
	private int fileNum;
	private String originalName;
	private String savedPath;

	public Myfile() {
	}

	public Myfile(int fileNum, String originalName, String savedPath) {
		super();
		this.fileNum = fileNum;
		this.originalName = originalName;
		this.savedPath = savedPath;
	}

	public int getFileNum() {
		return fileNum;
	}

	public String getOriginalName() {
		return originalName;
	}

	public String getSavedPath() {
		return savedPath;
	}

	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public void setSavedPath(String savedPath) {
		this.savedPath = savedPath;
	}

	@Override
	public String toString() {
		return "Myfile [fileNum=" + fileNum + ", originalName=" + originalName + ", savedPath=" + savedPath + "]";
	}

}
