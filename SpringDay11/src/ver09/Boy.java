package ver09;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person {
	@Override
	public void makeFood(int args) throws Exception {

		System.out.println("냉면 만든다 :");
		if (new Random().nextBoolean()) {
			throw new Exception("불남");
		}

	}
}
