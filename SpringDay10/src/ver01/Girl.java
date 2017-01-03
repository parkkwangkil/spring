package ver01;

import java.util.Random;

public class Girl implements person{
	@Override
	public void makeFood() {
		System.out.println("배고파");
		try {
			System.out.println("갈비을 만든다");
			if (new Random().nextBoolean()) {
				throw new Exception("고기 없다");
			}
			System.out.println("음식을 먹는다");
		} catch (Exception e) {
			System.out.println("정육점을 턴다");
			e.printStackTrace();
		}finally {
			System.out.println("경찰에게 잡혀간다");
		}
	}

}
