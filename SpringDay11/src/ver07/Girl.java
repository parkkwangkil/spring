package ver07;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class Girl implements Person {
	@Override
	public void makeFood() throws Exception {
		System.out.println("갈비을 만든다");
		if (new Random().nextBoolean()) {
			throw new Exception("고기 없다");
		}

	}

}
