package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ��Ư��Ƚ���� �ݺ��� ���� �ݺ����·ε� �����ϴ�
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("�����Է� (0:����)");
			n = sc.nextInt();
			
			if(n==0) {
				break;		//����� '��� Ż��
							// if���� ����x
			}
			System.out.println("n = "+ n +"\n");
		}
		sc.close();
	}

}
