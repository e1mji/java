package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//���� 3�� ����� �Է����� �Ǻ��Ͻÿ� 
		//1��)
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print(" ���� �Է� : ");
		n =sc.nextInt();
		
		String mul = ( n%3 == 0) ?"3�ǹ��" : "3�ǹ�� �ƴ�";
		
		System.out.printf("%d�� %s\n\n",n,mul);
		
		//���� : n�� �Է����ιް� ������ �Է½��Ѽ� 
		// ������ mul������ ���ǿ����ڷ� �Ҵ��Ų��.
		// �Է¹��� n�� 3���� ����� �������� 0�̵Ǹ�  3�ǹ���� ���
		// 0�̾ƴϸ�  "3�ǹ���ƴ�"�� ��½�Ų��.
		
		//2��) �� ������ �Է��ؼ� ū���� �Ǻ��Ͻÿ� 
		int n1,n2,big;
		
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		big = (n1 > n2)  ? n1: n2;
		
		System.out.printf("%d, %d �� ū���� %d\n\n",n1,n2,big);
		
		//���� : n1,n2,big�� ������Ÿ������ ������ �ϰ� 
		//���� big�� ���ǿ����ڸ� ���Խ��Ѽ� n1�� ũ�� n1, n2�� ũ�� n2�� ����Ѵ�.
		
		//3�� ) ���밪 ���
		
		int num;
		System.out.print("�����Է� : ");
		num = sc.nextInt();
		
		num = (num < 0 ) ? -num : num;
		System.out.println("���밪�� " + num);
		
		//����
		// num�� ������ ���� �����ѵ� ��ĳ�ʿ� �Ҵ�����ش�.
		// num�� 0���� ������ ��: -num�� ��� 
		// num�� 0���� ũ�� ���� : num�� ���
		
		
		sc.close();
		
	
	}

}
