package ver05;

import java.util.Random;

public class Boy implements Person {
	 @Override
	    public String makeFood(int arg) throws Exception {
	        /////////////////////////////////////////////
	        // �ٽɰ��ɻ���
	        System.out.println("�ø��� �����."+arg);
	        if (new Random().nextBoolean()) {
	            throw new Exception("�ҳ���!!!");
	        }
	        //////////////////////////////////////////////
	        return "���ִ� �ø��� �ϼ��ߴ�.";
	    }
	}


