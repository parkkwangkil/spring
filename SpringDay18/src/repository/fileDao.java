package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.FileMapper;
import vo.Myfile;

@Component
public class fileDao {
	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public int insertFile(Myfile myfile) {
		FileMapper mapper = session.getMapper(FileMapper.class);
		return mapper.insert(myfile);

	}

	public Myfile selectFile(int fileNum) {
		FileMapper mapper = session.getMapper(FileMapper.class);
		return mapper.select(fileNum);

	}
	public List<Myfile> selectAllFile(){
		FileMapper mapper = session.getMapper(FileMapper.class);
		return mapper.selectAll();
		
	}

}
