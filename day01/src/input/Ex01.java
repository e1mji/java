package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc;
		int num;
		
		sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		num = sc.nextInt();
		
		System.out.println("�Է¹��� num = " + num);
		
		sc.close();
	}

}
