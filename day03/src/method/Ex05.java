package method;

public class Ex05 {
	
	static void func(int n) {
		n +=5;
	}
	
	public static void main(String[] args) {
		// �������� : Ư�� �������� ���Ǵ� ����
		//- �ش� ���������� ��밡���ϰ� �ش� ������ ������ �޸𸮿��� ���ŵ�
		
		int n =15;
		
		System.out.println("n = " + n);
		
		int n1 =10;
		
		func(n1);
		System.out.println("n1 = "+ n1);
		
		// main�� �������� n��  func�� �������� n�� ���� �ٸ� �޸� 
		// #�̸��� ���Ƽ� �򰥸��� �̸��� �ٸ��� ����
	}

}
