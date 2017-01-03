package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.ArticleMapper;
import vo.Article;

@Component
public class ArticleDao {
	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public int insert(Article article) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.insertArticle(article);

	}

	public int delete(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.delete(num);

	}

	public int update(Article article) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.update(article);

	}

	public Article select(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.select(num);

	}

	public List<Article> selectAllList(int startRow, int endRow) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		Map<String, Integer> paramMap = new HashMap<>();
		paramMap.put("startRow", startRow);
		paramMap.put("endRow", endRow);
		return mapper.selectAllList(paramMap);
	}

	public int readCount(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.readCount(num);

	}

	public int addReadCount(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.addReadCount(num);

	}

	public int updateVote(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.vote(num);

	}

	public int addUpdate(int num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.addUpdate(num);

	}

	public int reply(Article article) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.reply(article);
	}
}
