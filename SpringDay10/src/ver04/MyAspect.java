package ver04;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void my_before(JoinPoint joinpoint){
		System.out.println("배고파");
		Object[] args = joinpoint.getArgs();
		System.out.println("before 준비중 :"+args[0]);
	}
	
	public void my_after_returning(Object result){
		System.out.println(result+"그냥 먹어");
	}
	public void my_after_throwing(Exception ex){
		System.out.println(ex.getMessage()+"개가 먹었다");
	}

}
