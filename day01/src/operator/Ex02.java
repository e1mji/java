package operator;

public class Ex02 {
	public static void main(String[] args) {
		//���Կ����� : ���� �Ҵ��ϴ� ������
		// 1. �º��� '����', �캯��  '�����'
		// 2. �׻� �캯���� �����Ѵ�
		// 3. �纯�� �ڷ����� ��ġ��Ű����  �Ѵ�
		
		int n = 10 + 3;
		System.out.println("n = "+ n + "\n");
		
		//���� ���� ������ : ��� + ����
		n +=5;	// n = n+5;
		System.out.println("n = " + n);
		
		n -= 2;
		System.out.println("n = " + n);
								
		n *= 3;
		System.out.println("n = " + n);
		
		n /= 5;
		System.out.println("n = " + n);
		
		n %= 7;
		System.out.println("n = " + n);
	}

}
