package ver08;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Boy implements Person {
	@Override
	public String makeFood(int arg) throws Exception {

		System.out.println("�ø� ����� :" + arg);
		if (new Random().nextBoolean()) {
			throw new Exception("�ҳ�");
		}
		return "�ø��� ������µ� ���� ����";
	}
}
