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
			System.out.println("배고파");
		}
	@AfterReturning("my_point()")
		public void my_after_returning() {
			System.out.println("음식 먹음");
		}
	@AfterThrowing("my_point()")
		public void my_after_throwing() {
			System.out.println("불낸다");
		}
	@After("my_point()")
		public void my_after() {
			System.out.println("맞는다");
		}

	}
