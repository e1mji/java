package var;

public class Quiz {
	public static void main(String[] args) {
		// 1. �̸�, ����, Ű, �ּ�, ������ ������ ������ ����
		// ��, ������ char�� ����
		String name, address;
		int age;
		double height;
		char gender;
		
		
		// 2. 1���� ������ ���� ä���
		name = "ȫ�浿";
		age = 31;
		height = 176.3;
		gender = '��';
		address = "�λ� ������ ������";
		
		
		// 3. ������ ������ �Ʒ��� ���� ����Ѵ�
		// �̸� : ȫ�浿
		// ���� : 31��
		// ���� : 176.3cm
		// ���� : ��
		// �ּ� : �λ� ������ ������
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + height + "cm");
		System.out.println("���� : " + gender);
		System.out.println("�ּ� : " + address);
		
	}

}
