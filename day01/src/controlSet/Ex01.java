package controlSet;

import java.util.Scanner;

// ��� : �ڵ��� �帧�� �����ϴ� ���� 
// 1.���ǹ� : ��/������ ���� �ڵ��� �帧�� �б�
// 2. �ݺ��� : ��/������ ���� �ڵ带 ����
// 3. ������� : �� �� ������ ����

public class Ex01 {
	public static void main(String[] args) {
//		if : ���ǽ��� ���̸� ���ӹ����� ����
//		���ӹ����̶� : Ư�� ������ ���Ե� ������ �ǹ�. {}�ȿ� �ۼ���
//		���ӹ����� �����̸� {}�� �����ص��ȴ�.
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
	
		if (age >= 20) {
			System.out.println("����");
		}
		else {
			System.out.print("�̼�����");
		}
		System.out.println("�Դϴ�");
		
		//������ �ؼ�
		// ���� age�� 20���� ũ�ų� ������  print�� ������ ����ϰ� 
		// else : �ƴϸ� �̼����ڸ� ����Ѵ�.
		// ���ǽ��� ���������� println(�Դϴ�)�� ����Ѵ�. 
		
		sc.close();
	}

}
