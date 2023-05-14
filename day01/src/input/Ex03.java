package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		//문자열과 문자 입력 
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 : ");
		str = sc.next();
		
		System.out.println("str = "+ str);
		
	
		
		System.out.println("str[0] = "+ str.charAt(0));
		System.out.println("str[2] = "+ str.charAt(2) + "\n");
		
		// charAt(번호) : 문자열에서 지정 위치의 문자 하나를 반환
		//입력 : 깃허브 =>  깃, 브 출력 
		
		char ch;
		
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		System.out.println("ch = "+ ch);
		
		//입력 : 남성 = > 남 출력 
		
		sc.close();
	}

}
