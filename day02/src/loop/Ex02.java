package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
		//1. ������ 2���� �ݺ����� ���, �� x1 ~ x9����
		//2. �Է¹����� ��ȯ�ؼ� �Է��� �������� ��µǰ� �Ѵ�
		//3. �������ε� ����� �غ���
		
		Scanner sc = new Scanner(System.in);
		int i =1,dan;
		
		System.out.print("������ ���?");
		dan = sc.nextInt();
		
		while (i <=9) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i++;
		}
		System.out.println();
		
		i=9;
		while (i>=1) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i--;
		}
		sc.close();
	}
	//������ �ؼ�:
	//���� i�� ���������̴�.while������ i�� 9�� �ɶ����� 
	// dan�� ������ �Է¹޾Ƽ� �Է¹��� ���� x �ݺ��� i�� ���� �������� ����Ѵ� 
	// ù��° ������ ������ i++�� ���� i��  �����ϰԵǾ� 1,2,3,4...
	// 9�ܱ��� ����̵ȴ�.				
	// ����: i�� 9�� �����ʱ�ȭ  => ���������� i--;  i�� �����ϰԵǸ鼭 
	// �������� �������� ��µȴ�.
										
}
