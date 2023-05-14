package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc;
		int num;
		
		sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		num = sc.nextInt();
		
		System.out.println("입력받은 num = " + num);
		
		sc.close();
	}

}
