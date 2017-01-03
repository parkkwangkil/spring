package ver08;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Girl implements Person {
	public String makeFood(int arg) throws Exception {
		System.out.println("갈비 만들기 시작 :" + arg);
		if (new Random().nextBoolean()) {
			throw new Exception("불남");

		}
		return "말 그대로 숯? 불갈비가 만들어 짐";

	}

}
