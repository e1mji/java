package loop;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		//�Է¹��� ������ �Ҽ�,����� �Ǻ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int n, count =0;
		
		System.out.print("�����Է� :");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n%i ==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("(" + count + "��)");
		
		if (count == 2) {
			System.out.println("�Ҽ�");
		}
		else {
			System.out.println("�Ҽ��ƴ�");
		}
		sc.close();
	}
	// ������ �ؼ� : 
	// ���� n�� ������ �Է¹ް� 
	// �ݺ����� �̿��ؼ� �Է¹��� ������ŭ i�� ������Ű�� 
	// ���ǹ� if�� ���� n�� i�� ���°� ����������� count������ +��Ű��
	// ����� ����� ����Ѵ�. 
	// ���� �Է¹��� ������ ����� 2����� 1�� �ڱ��ڽŸ� ���������� ���̹Ƿ� 
	// "�Ҽ�"�� ����Ʈ�Ѵ�.
					
}
