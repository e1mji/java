package method;

public class Ex01 {
	//�޼��� ���� : �޼����� �����ڵ尡 ����� ��
	static void hello() {
		for (int i =1; i<=5; i++) {
			System.out.println(i+"Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(); 	//�޼��� ȣ�� :����� �޼��带 ����ϴ� ��
		
		hello();	// �޼����� ���뼺 : �ѹ� ����� �޼���� ����̰� ��밡��
		
		hello();
		
		// *�޼��� ȣ�� �帧
		// 1. �޼��尡 ȣ��Ǹ� ������ġ(=��)�� ����ϰ� �޼���� �̵�
		// 2. �޼��尡 �̵� �� �ڵ带 ���������� ����
		// 3. �޼��尡 ����Ǹ� 1������ ����� ��ġ�� �ǵ��ư��� ���� �ڵ带 �̾ ����
		
	}

}
