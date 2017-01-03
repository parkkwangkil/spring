package ver05;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void my_around(ProceedingJoinPoint target) {
		System.out.println("배고파");
		Object[] args = target.getArgs();
		System.out.println(args[0] + "" + "인분의 음식을 만들자");
		try {
			Object result = target.proceed();
			System.out.println(result + "음식을 먹인다");
		} catch (Throwable e) {
			System.out.println("전멸했다");
	//		e.printStackTrace();
		} finally {
			System.out.println("병원으로 보낸다");

		}
	}

}
