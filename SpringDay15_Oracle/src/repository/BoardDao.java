package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.BoardMapper;
import vo.Article;

@Component
public class BoardDao {
	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(Article article){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(article);
		
	}
	
	public List<Article> selectList(int startRow, int count){
		Map<String, Integer> map = new HashMap();
		map.put("startRow", startRow);
		map.put("endRow", startRow+count);
		BoardMapper mapper = session.getMapper(BoardMapper.class);	
		return mapper.selectAllList(map);
		
	}
	
	public int updateReadCount(int articleNum){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.updateReadCount();
		
	}
	
	public Article select (int articleNum){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(articleNum);
		
	}
	
	public int selectCount(){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectCount();
		
	}

	public int update(Article articleNum){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.update(articleNum);
		 
		
	}
	
	public int delete(Article articleNum){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.delete(articleNum);
		
	}
}
