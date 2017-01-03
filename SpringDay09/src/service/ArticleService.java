package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.ArticleDao;
import vo.Article;

@Component
public class ArticleService {
	@Autowired
	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}

	public Article selectNoReadCount(int num) {
		return dao.select(num);

	}

	public Article selectReadCount(int num) {
		dao.updateVote(num);
		return dao.select(num);

	}

	public int update(Article article) {
		return dao.update(article);

	}

	public int updateVote(int num) {
		return dao.updateVote(num);

	}

	public int Reply(Article article) {
		return dao.reply(article);

	}

	public int addUpdate(int num) {
		return dao.addUpdate(num);
	}

	public boolean isPassword(int num, String password) {
		Article article = dao.select(num);
		if (article == null) {
			return true;
		} else {
			if (password.equals(article.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public List<Article> selectPage(int startRow, int endRow) {
		return dao.selectAllList(startRow, endRow);

	}

	public int insert(Article article) {
		return dao.insert(article);
	}

	public int delete(int num) {
		// TODO Auto-generated method stub
		return dao.delete(num);
	}

}
