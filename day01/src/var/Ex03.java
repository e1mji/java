package var;

public class Ex03 {
	public static void main(String[] args) {
		//printf() : ���¸� ��� �ڿ��� �����͸� ä���� ��� 
		// -%s : String, ���ڿ��ڸ�
		// -%d : Decimal, 10�� �����ڸ�
		// -%f : Float. �Ǽ��ڸ� 
		// -%c " Character, �����ڸ� 
		
		String name = "ȫ�浿";
		int age = 16;
		double height = 161.3;
		char gender = '��';
		
		System.out.printf("�̸� : %s (%d��, %c)\n",name,age,gender);
		System.out.printf("���� : %f cm\n", height);
		// %f �� �⺻ �Ҽ��� 6�ڸ��� ���
		
		System.out.printf("���� : %.1f cm\n",height);
		
	}

}
