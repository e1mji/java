package method;

public class Ex02 {
	
	//�Ű����� (parameter) : �޼��� ȣ��� ���޵Ǵ� ���� ����
	static void hello(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println(i+ " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	//�������� (=arguments) : �޼��忡 �����ϴ� ��
		
		hello(2);
		
		hello(6);
		
		//�߸��� �����
		//hello();		//�������� ���� ���� 
		//hello(5,3);	//�Ű����� ���� ���� 
		//hello("5");	//�ڷ��� ����ġ
		
		//# ���) �޼��� ȣ��� �������ڿ� �Ű������� ���� �� �ڷ����� ��ġ��Ų��!!!
	}

}
