package ver05;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void my_around(ProceedingJoinPoint target) {
		System.out.println("�����");
		Object[] args = target.getArgs();
		System.out.println(args[0] + "" + "�κ��� ������ ������");
		try {
			Object result = target.proceed();
			System.out.println(result + "������ ���δ�");
		} catch (Throwable e) {
			System.out.println("�����ߴ�");
	//		e.printStackTrace();
		} finally {
			System.out.println("�������� ������");

		}
	}

}
