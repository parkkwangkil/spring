package ver09;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Girl implements Person {
	public void makeFood(int args) throws Exception {
		System.out.println("갈비 만들기 시작 :" );
		if (new Random().nextBoolean()) {
			throw new Exception("불남");

		}
		

	}

}
