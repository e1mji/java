package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. ������ �Է¹޾Ƽ� 1~n���� �Ϸķ� ����ϼ���
		// 2. ������ �Է¹޾Ƽ� 1~n���� �հ踦 ���
		Scanner sc = new Scanner(System.in);
		int n, i = 1, total = 0;

		System.out.print("�����Է�:");
		n = sc.nextInt();

		while (i <= n) {
			System.out.print(i + " ");

			total += i;
			i++;
		}

		/*
		 * �ؼ� n�� �Է����� �޾Ƽ� while������ ���� ������ŭ �ݺ��Ѵ�. �հ�� �������� �̿��ؼ� total������ ���մ��Կ����ڷ� �Ҵ�����ش�.
		 */
		System.out.println("\n�հ�  :" + total);

		// 3.������ �Է¹޾Ƽ� ���� �Ųٷ� ����ϼ���
		// ex)123 -> ��� : 321

		int rev = 0;

		System.out.print("\n�����Է�:");
		n = sc.nextInt();

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println("rev = " + rev);

//		 	���� ���, n �� 1234�� ���:
//			ù ��° �ݺ�: rev = 0 * 10 + 1234 % 10 = 4, n = 1234 / 10 = 123
//			�� ��° �ݺ�: rev = 4 * 10 + 123 % 10 = 43, n = 123 / 10 = 12
//			�� ��° �ݺ�: rev = 43 * 10 + 12 % 10 = 432, n = 12 / 10 = 1
//			�� ��° �ݺ�: rev = 432 * 10 + 1 % 10 = 4321, n = 1 / 10 = 0
//			
//			���� ���������� rev���� 1234�� ������ 4321�� ����ǰ�, �� ���� ��µȴ�.

		sc.close();
	}
}
