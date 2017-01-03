package ver09;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(* makeFood(..))")
	public void my_point(){}
	 @Around("my_point()")
	public void my_around(ProceedingJoinPoint target) {
		System.out.println("�����");
		Object[] args = target.getArgs();
		System.out.println("before �غ�"+args[0]);
		try {
			Object result = target.proceed();
			System.out.println(result + "������ ���δ�");
		} catch (Throwable e) {
			System.out.println(e.getMessage()+"�����ߴ�");
			e.printStackTrace();
		} finally {
			System.out.println("�������� ������");

		}
	}

}
