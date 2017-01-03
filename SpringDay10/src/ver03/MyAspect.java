package ver03;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
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
