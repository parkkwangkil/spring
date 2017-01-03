package ver06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(void makeFood())")
	public void my_point(){}
	@Before("my_point()")
		public void my_before() {
			System.out.println("�����");
		}
	@AfterReturning("my_point()")
		public void my_after_returning() {
			System.out.println("���� ����");
		}
	@AfterThrowing("my_point()")
		public void my_after_throwing() {
			System.out.println("�ҳ���");
		}
	@After("my_point()")
		public void my_after() {
			System.out.println("�´´�");
		}

	}
