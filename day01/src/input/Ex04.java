package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ���� : �����͸� �ӽ÷� �����ϴ� ����
		//- Scanner�� ���۸� Ȱ���ؼ� Ű���� ���� �о�´� 
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.print("�� ���� �Է� :");
		n1 = sc.nextInt();	//next() : ���ۿ��� �����͸� �����´� (space�� enter)
		n2 = sc.nextInt();	//- ���� ���ۿ� �����Ͱ� ������ ����ڿ��� �Է��� �䱸 
		
		System.out.printf("n1 = %d , n2 = %d\n\n",n1,n2);
		
		sc.nextLine(); //nextLine() : ������ ��� �����͸� �����´�
		
		int n3, n4;
		
		System.out.print("�ٽ� �� ���� �Է� : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n",n3,n4);
		
		sc.close();
	}
								
}
