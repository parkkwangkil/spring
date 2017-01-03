package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.MemberDao;
import vo.Member;

@Component
public class MemberService {
	@Autowired
	private MemberDao dao;

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	public void membeFunc() throws Exception {
		Member member1 = new Member(100, "b", "1111", "b@b.com", "010");

		Member member2 = new Member(100, "c", "1111", "c@c.com", "010");
		
		dao.insert(member1);
		if(true){
			throw new Exception("의도적 예외 객체");
		}
		dao.insert(member2); 
		
	}

}