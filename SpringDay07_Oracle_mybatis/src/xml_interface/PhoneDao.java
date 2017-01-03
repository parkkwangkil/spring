package xml_interface;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.Phone;

public class PhoneDao {
	private SqlSessionFactory factory;

	public PhoneDao() {
		String resource = "xml_interface/conf.xml";
		InputStream is = null;

		try {
			is = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			System.out.println("io error");
			e.printStackTrace();
		}
	}

	public int insert(Phone phone) {
		SqlSession session = factory.openSession(true);
		PhoneMapper mapper = session.getMapper(PhoneMapper.class);
		return mapper.insertPhone(phone);
	}

	public int delete(int num) {
		SqlSession session = factory.openSession(true);
		PhoneMapper mapper = session.getMapper(PhoneMapper.class);
//		Map<String, Integer> paramMap = new HashMap<>();
//		paramMap.put("pnum", pnum);
		return mapper.deletePhone(num);

	}

	public Phone select(int num) {
		SqlSession session = factory.openSession(true);
		PhoneMapper mapper = session.getMapper(PhoneMapper.class);
		return mapper.selectPhone(num);
	}
	
	public List<Phone> selectList(){
		SqlSession session = factory.openSession(true);
		PhoneMapper mapper = session.getMapper(PhoneMapper.class);
		return mapper.selectPhoneList();
		
	}
	
	public int update(int num){
		SqlSession session = factory.openSession(true);
		PhoneMapper mapper = session.getMapper(PhoneMapper.class);
		return mapper.updatePhone(num);
		
 	}

}
