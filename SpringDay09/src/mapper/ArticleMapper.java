package mapper;

import java.util.List;
import java.util.Map;

import vo.Article;

public interface ArticleMapper {

	public int insertArticle(Article article);

	public int delete(int num);

	public int update(Article article);

	public Article select(int num);

	public List<Article> selectAllList(Map<String, Integer> paramMap);

	public int readCount(int num);

	public int reply(Article article);

	public int addReadCount(int num);

	public int addUpdate(int num);

	public int vote(int num);
	

}
