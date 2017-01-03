package ver04;

import java.util.Random;

public class Boy implements Person {
	@Override
	public String makeFood(int arg) throws Exception {

		System.out.println("냉면 만든다 :" + arg);
		if (new Random().nextBoolean()) {
			throw new Exception("불남");
		}
		return "냉면을 만들었는데 맛이 없다";
	}
}
