package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// Java�� switch���� ���ڿ��� ó���� �� �ִ�. 
		Scanner sc= new Scanner(System.in);
		String menu;
			
		System.out.println("--------- menu ---------");
		System.out.println("\t1. ¥���");
		System.out.println("\t2. «��");
		System.out.println("\t3. ������");
		System.out.println("\t4. ������");
		
		System.out.print("\n>>> ");
		menu = sc.next();
		
		switch (menu) {
		case "짜장면" : case "1":
			System.out.println("¥��� �ֹ�~");
			break;
		case "짬뽕": case "2":
			System.out.println("«�� �ֹ�~");
			break;
		case "탕수육": case "3":
			System.out.println("������ �ֹ�~");
			break;
		case "볶음밥" : case "4":
			System.out.println("������ �ֹ�~");
			break;
		default:
			System.out.println("���� �޴� �Դϴ�");
		}
		
		sc.close();
		
	
	}

}
