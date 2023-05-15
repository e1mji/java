package _switch;

import java.util.Scanner;

/*
 * ���ù� switch
 * -������ �ƴ�, ������ �ڵ带 �б��Ѵ�
 * - �ַ� �޴��� ������ �� ���ֻ��ȴ�.
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;

		while (true) {
			System.out.print("�޴� (1~3)");
			if (sc.hasNextInt()) {
				menu = sc.nextInt();

				switch (menu) { // switch (��) : ������ ������ ���ڿ��� ����
				case 1:
					System.out.println("1������");
					break; // break : ����� ��� Ż��
				case 2:
					System.out.println("2�� ����");
					break;
				case 3:
					System.out.println("3�� ����");
					break;
				default:
					System.out.println("���� �޴�");
				}
			} else {
				System.out.println("�ùٸ��Է��� �ƴմϴ�.");

			}
		}

	}

}
