package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//�̸�, ����,�ּҸ� �Է¹��� ������ �����غ���
		
		String name,address;
		int age;
		
		//2. Scanner�� Ȱ���ؼ� 1���� ������ �Է��� �޴´� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print(" �ּ� : ");
		address = sc.nextLine();
		
		// 3. ����� �Ʒ��� ����
		// �̸� : ȫ�浿 (17��)
		// �ּ� : �λ걤���� ������
		
		System.out.printf("\n�̸� : %s(%d��)\n",name,age);
		System.out.println("�ּ� : " + address);
		
		sc.close();
		
		
	}

}
