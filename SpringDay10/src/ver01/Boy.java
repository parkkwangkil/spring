package ver01;

import java.util.Random;

public class Boy implements person {
	@Override
	public void makeFood() {
		System.out.println("�����");
		try {
			System.out.println("�ø��� �����");
			if (new Random().nextBoolean()) {
				throw new Exception("�ҳ�");
			}
			System.out.println("������ �Դ´�");
		} catch (Exception e) {
			System.out.println("�״´�");
		//	e.printStackTrace();
		}finally {
			System.out.println("��ȭ�⸦ ����Ѵ�");
		}
	}
}