package ver09;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person {
	@Override
	public void makeFood(int args) throws Exception {

		System.out.println("�ø� ����� :");
		if (new Random().nextBoolean()) {
			throw new Exception("�ҳ�");
		}

	}
}