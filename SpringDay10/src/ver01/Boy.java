package ver01;

import java.util.Random;

public class Boy implements person {
	@Override
	public void makeFood() {
		System.out.println("배고파");
		try {
			System.out.println("냉명을 만든다");
			if (new Random().nextBoolean()) {
				throw new Exception("불남");
			}
			System.out.println("음식을 먹는다");
		} catch (Exception e) {
			System.out.println("죽는다");
		//	e.printStackTrace();
		}finally {
			System.out.println("소화기를 사용한다");
		}
	}
}