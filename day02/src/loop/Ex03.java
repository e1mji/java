package loop;

import java.util.Scanner;

//�ݺ��� ����
// 1. ���� Ƚ�� �ݺ� : Ƚ���� �ִ¹ݺ� ex) 5,10�� ��
// 2. ��Ư�� Ƚ�� �ݺ� : Ƚ���� ������ ���� �ݺ�.  ex)���Ḧ ����������
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		
		while (n!=0) {
			System.out.println("�����Է�(0:����)");
			n=sc.nextInt();
			
			System.out.println("n = "+ n + "\n");
		}
		sc.close();
	}
	//������ �ؼ�:
	// ���� n�� 1�̴�. n�� �Է����� �ް� 
	// �ݺ��������� n��0�� �ƴ϶��(NOT) �Է��� �ݺ��Ѵ�.

}
