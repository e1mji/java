package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//��ø ���ǹ�
		//���ǹ� �ȿ� ���ǹ��� �����ϴ� ���
		//�������� ����ó���� ���ؼ� ��������� ����� �ڵ��� �������� ��������.
		
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.print("�����Է� :");
		n = sc.nextInt();
		
		if (n%2 == 0  ) {
			System.out.println("¦��");
			
			if (n%3 ==0) {
				System.out.println("¦���̸鼭 3�ǹ��");
			}
			else {
				System.out.println("¦�������� 3�ǹ���ƴ�");
			}
		}
		else {
			System.out.println("Ȧ��");
			
			if(n%3 ==0) {
				System.out.println("Ȧ���̸鼭 3�ǹ��");
			}
			else {
				System.out.println("Ȧ�������� 3�ǹ�� �ƴ�");
			}
		}
		
		// ������ �ؼ� 
//		n�� �Է����� �Ҵ�����ش�.
//		n�� 2���� ���� ������� ¦���̰� if�� ���ο��� �Ǵٸ� if���� ��� 
//		n�� 3���� ����������� ¦���̸鼭 3�ǹ���̰�, �׷��������� (else)
//		¦�������� 3�ǹ���� �ƴ��� ��½�Ų��.
		
		
		sc.close();
	}

}
