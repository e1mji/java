package operator;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//���� ������: ���ǿ� ���� ���� '����'�ϴ� ������
		//��ǻ� �ڵ带 ©�� ���ֻ��Ǵ� �� ����
		//���� : (���ǽ�) ? �� : ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� �Է� : ");
		n= sc.nextInt();
		
		String plus = (n < 0) ? "����" : "���";
		//plus�� n�� 0���� ������ ��: ����,
		//plus�� n�� 0���� ũ�� ���� :���
		
		System.out.printf("%d(��)�� %s �Դϴ�\n",n,plus);
		
		sc.close();
	}

}
