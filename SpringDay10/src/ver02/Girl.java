package ver02;

import java.util.Random;

public class Girl implements Person {
	@Override
	public void makeFood() throws Exception {
		System.out.println("������ �����");
		if (new Random().nextBoolean()) {
			throw new Exception("��� ����");
		}

	}

}
