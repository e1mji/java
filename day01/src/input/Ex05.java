package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// ���ڿ� ���� ���� �Է�
		// 1. next(), next�ڷ���()
		// - space, enter�� �����ڷ� �ν�
		// - space�� enter�� �Է����� �������� ����
		//
		// 2. nextLine()
		// - enter�� �����ڷ� �ν�
		// - enter���� �Է����� �����´�
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		
		
		System.out.print("���� ���� �Է� : ");
		str1 = sc.next();
		
		System.out.println("str1 = " + str1 + "\n");
		
		
		sc.nextLine();
		
		System.out.print("�ٽ� �ѹ� �� �Է� : ");
		str2 = sc.nextLine();
		
		System.out.println("str2 = " + str2);
		
		
		sc.close();
	}

}
