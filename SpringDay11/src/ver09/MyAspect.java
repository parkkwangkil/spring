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
		System.out.println("배고파");
		Object[] args = target.getArgs();
		System.out.println("before 준비물"+args[0]);
		try {
			Object result = target.proceed();
			System.out.println(result + "음식을 먹인다");
		} catch (Throwable e) {
			System.out.println(e.getMessage()+"전멸했다");
			e.printStackTrace();
		} finally {
			System.out.println("병원으로 보낸다");

		}
	}

}
