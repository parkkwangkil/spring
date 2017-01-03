package repository;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.MemberMapper;
import vo.Member;
@Component
public class MemberDao {
@Autowired
private SqlSessionTemplate sessionTemplate;



	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
	this.sessionTemplate = sessionTemplate;
}



	public Member select(String id) {
		MemberMapper mapper = sessionTemplate.getMapper(MemberMapper.class);
		return mapper.selectMapper(id);
	}

}
