package ver02;

public class MyAspect {
	// boy girl Ŭ����� �������� �����ϰ��� �ϴ� ���� ���ɻ縦 ������ Ŭ����
	public void my_before() {
		System.out.println("�����");
	}

	// �ٽ� ���ɻ��� ���� ������ �۾�
	public void my_after_returning() {
		System.out.println("���� ����");
	}

	// �ٽ� ���� ���� ���� ���� �� �۾�
	public void my_after_throwing() {
		System.out.println("�ҳ���");
	}

	// ���� �����̰� ���� �����̵� ��·�� ����
	public void my_after() {
		System.out.println("�´´�");
	}

}
