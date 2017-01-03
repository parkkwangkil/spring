package ver03;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void myAround(ProceedingJoinPoint target){
		System.out.println("�����");
		try {
			target.proceed(); // �ٽ� ���ɻ��� �޼ҵ� ����
			System.out.println("��~ ������ �԰� �Ͱ�");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("�������� ���̰�");
			e.printStackTrace();
		}finally {
			System.out.println("�ҳ���");
		}
	}

}
