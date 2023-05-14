package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// 문자열 띄어쓰기 포함 입력
		// 1. next(), next자료형()
		// - space, enter를 구분자로 인식
		// - space와 enter는 입력으로 가져오지 않음
		//
		// 2. nextLine()
		// - enter만 구분자로 인식
		// - enter까지 입력으로 가져온다
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		
		
		System.out.print("띄어쓰기 포함 입력 : ");
		str1 = sc.next();
		
		System.out.println("str1 = " + str1 + "\n");
		
		
		sc.nextLine();
		
		System.out.print("다시 한번 더 입력 : ");
		str2 = sc.nextLine();
		
		System.out.println("str2 = " + str2);
		
		
		sc.close();
	}

}
