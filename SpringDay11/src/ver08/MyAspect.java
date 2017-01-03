package ver08;

import org.aspectj.lang.JoinPoint;
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
	@Pointcut("execution(* makeFood(*))")
	public void my_point(){}
	@Before("my_point()")
	public void my_before(JoinPoint joinpoint){
		System.out.println("�����");
		Object[] args = joinpoint.getArgs();
		System.out.println("before �غ��� :"+args[0]);
	}
	@AfterReturning(pointcut="my_point()", returning="result")
	public void my_after_returning(Object result){
		System.out.println(result+"�׳� �Ծ�");
	}
	
	@AfterThrowing(pointcut="my_point()", throwing="ex")
	public void my_after_throwing(Exception ex){
		System.out.println(ex.getMessage()+"���� �Ծ���");
	}
	@After("my_point()")
	public void my_after(){
		System.out.println("���´�");
	}

}
