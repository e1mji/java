package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		//���ڿ��� ���� �Է� 
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� : ");
		str = sc.next();
		
		System.out.println("str = "+ str);
		
	
		
		System.out.println("str[0] = "+ str.charAt(0));
		System.out.println("str[2] = "+ str.charAt(2) + "\n");
		
		// charAt(��ȣ) : ���ڿ����� ���� ��ġ�� ���� �ϳ��� ��ȯ
		//�Է� : ����� =>  ��, �� ��� 
		
		char ch;
		
		System.out.print("���� : ");
		ch = sc.next().charAt(0);
		System.out.println("ch = "+ ch);
		
		//�Է� : ���� = > �� ��� 
		
		sc.close();
	}

}
