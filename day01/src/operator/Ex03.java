package operator;

public class Ex03 {
	public static void main(String[] args) {
		// ���������� : �ǿ����ڸ� 1���� Ȥ�� 1����
		
		int n = 10;
		
		n++; 	//��ġ : �����ڰ� �ڿ� ���� ���
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n  = " + n);
		
		++n;	//��ġ : �����ڰ� �տ� ���� ���
		System.out.println("n = " + n);
									
		--n;
		System.out.println("n = " + n + "\n");
		
		// *��ġ, ��ġ�� �⺻������ ���̰� ����
		// �� ,�ٸ������ ���� ���� ���̰� �߻�
		
		int n1=10, n2,n3;
		
		n2 = ++n1;	//��ġ : ���� ���� �� �ٸ� ������ ���� 
		System.out.printf("n1 = %d , n2 = %d\n", n1,n2);
		
		n1 = 10;
		
		n3 = n1++;	//��ġ : �ٸ� ���� �� ������ ���� 
		System.out.printf("n1 = %d, n3 = %d\n",n1,n3);
		
		
		
	}								
								
}
