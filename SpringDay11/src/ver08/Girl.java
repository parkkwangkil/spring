package ver08;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Girl implements Person {
	public String makeFood(int arg) throws Exception {
		System.out.println("���� ����� ���� :" + arg);
		if (new Random().nextBoolean()) {
			throw new Exception("�ҳ�");

		}
		return "�� �״�� ��? �Ұ��� ����� ��";

	}

}
