package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//중첩 조건문
		//조건문 안에 조건문을 구성하는 방식
		//세부적인 조건처리를 위해서 사용하지만 남용시 코드의 가독성이 떨어진다.
		
		Scanner sc= new Scanner(System.in);
		int n;
		
		System.out.print("정수입력 :");
		n = sc.nextInt();
		
		if (n%2 == 0  ) {
			System.out.println("짝수");
			
			if (n%3 ==0) {
				System.out.println("짝수이면서 3의배수");
			}
			else {
				System.out.println("짝수이지만 3의배수아님");
			}
		}
		else {
			System.out.println("홀수");
			
			if(n%3 ==0) {
				System.out.println("홀수이면서 3의배수");
			}
			else {
				System.out.println("홀수이지만 3의배수 아님");
			}
		}
		
		// 나만의 해설 
//		n을 입력으로 할당시켜준다.
//		n이 2으로 나누 어떨어지면 짝수이고 if문 내부에서 또다른 if문을 열어서 
//		n이 3으로 나누어떨어지면 짝수이면서 3의배수이고, 그렇지않으면 (else)
//		짝수이지만 3의배수는 아님을 출력시킨다.
		
		
		sc.close();
	}

}
