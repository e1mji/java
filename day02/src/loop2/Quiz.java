package loop2;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
//		����1) N x N �����
//		�Է� : 5
		/*
		 * ***** ***** ***** ***** *****
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("�� �?:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���� 2) �����ﰢ��
		// �Է� : 5
		/*
		 * * ** *** **** *****
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// ���� 3) 2���� ���Ʒ��� ����
		// �Է�: 5
		/*
		 * ***** **** *** ** *
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// ����4) 2���� �¿�� ����
		// �Է� : 5
		/*
		 *     * 
		 *    ** 
		 *   *** 
		 *  **** 
		 * *****
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		//Ʈ��
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n -1-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	}

