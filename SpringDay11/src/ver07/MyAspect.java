package ver07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(void makeFood())")
	public void my_point(){}
	@Around("my_point()")
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
