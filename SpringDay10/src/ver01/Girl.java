package ver01;

import java.util.Random;

public class Girl implements person{
	@Override
	public void makeFood() {
		System.out.println("�����");
		try {
			System.out.println("������ �����");
			if (new Random().nextBoolean()) {
				throw new Exception("��� ����");
			}
			System.out.println("������ �Դ´�");
		} catch (Exception e) {
			System.out.println("�������� �ϴ�");
			e.printStackTrace();
		}finally {
			System.out.println("�������� ��������");
		}
	}

}
