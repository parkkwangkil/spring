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
		System.out.println("배고파");
		try {
			target.proceed(); // 핵심 관심사항 메소드 실행
			System.out.println("난~ 음식을 먹고 싶고");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("실패했을 뿐이고");
			e.printStackTrace();
		}finally {
			System.out.println("불낸다");
		}
	}

}
