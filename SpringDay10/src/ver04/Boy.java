package ver04;

import java.util.Random;

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
