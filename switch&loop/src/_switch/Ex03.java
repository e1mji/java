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
		case "¥���": case "1":
			System.out.println("¥��� �ֹ�~");
			break;
		case "«��": case "2":
			System.out.println("«�� �ֹ�~");
			break;
		case "������": case "3":
			System.out.println("������ �ֹ�~");
			break;
		case "������": case "4":
			System.out.println("������ �ֹ�~");
			break;
		default:
			System.out.println("���� �޴� �Դϴ�");
		}
		
		sc.close();
		
	
	}

}
