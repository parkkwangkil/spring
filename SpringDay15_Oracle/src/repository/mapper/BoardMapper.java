package repository.mapper;

import java.util.List;
import java.util.Map;

import vo.Article;

public interface BoardMapper {

	public int insert(Article article);

	public List<Article> selectAllList(Map<String, Integer> map);

	public int updateReadCount();

	public Article select(int articleNum);

	public int selectCount();

	public int delete();

	public int update(Article articleNum);

	public int delete(Article articleNum);



}
