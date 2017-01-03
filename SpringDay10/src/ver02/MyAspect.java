package ver02;

public class MyAspect {
	// boy girl 클래스등에 공통으로 적용하고자 하는 공통 관심사를 구현한 클래스
	public void my_before() {
		System.out.println("배고파");
	}

	// 핵심 관심사항 정상 종료후 작업
	public void my_after_returning() {
		System.out.println("음식 먹음");
	}

	// 핵심 관심 사항 에어 종료 후 작업
	public void my_after_throwing() {
		System.out.println("불낸다");
	}

	// 정상 종료이건 에러 종료이든 어쨌든 종료
	public void my_after() {
		System.out.println("맞는다");
	}

}
