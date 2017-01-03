package ver04;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void my_before(JoinPoint joinpoint){
		System.out.println("�����");
		Object[] args = joinpoint.getArgs();
		System.out.println("before �غ��� :"+args[0]);
	}
	
	public void my_after_returning(Object result){
		System.out.println(result+"�׳� �Ծ�");
	}
	public void my_after_throwing(Exception ex){
		System.out.println(ex.getMessage()+"���� �Ծ���");
	}

}
