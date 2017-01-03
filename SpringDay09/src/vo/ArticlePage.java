package vo;

import java.util.List;

public class ArticlePage {
	private List<Article> articleList;
	private int startRow;
	private int endRow;
	private int totalCount;
	private int currentPage;

	public ArticlePage(List<Article> articleList, int startRow, int endRow, int totalCount, int currentPage) {
		super();
		this.articleList = articleList;
		this.startRow = startRow;
		this.endRow = endRow;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
	}

	public List<Article> getArticleList() {
		return articleList;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String toString() {
		return "ArticlePage [articleList=" + articleList + ", startRow=" + startRow + ", endRow=" + endRow
				+ ", totalCount=" + totalCount + ", currentPage=" + currentPage + "]";
	}

}
