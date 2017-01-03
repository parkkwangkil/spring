package xml_interface;

import java.util.List;
import java.util.Map;

import vo.Phone;

public interface PhoneMapper {

	public int insertPhone(Phone phone);

	public Phone selectPhone(int pnum);

	public List<Phone> selectPhoneList();

	public int updatePhone(int pnum);

	public int deletePhone(int pnum);

}
