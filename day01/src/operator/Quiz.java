package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//문제 3의 배수를 입력으로 판별하시오 
		//1번)
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print(" 정수 입력 : ");
		n =sc.nextInt();
		
		String mul = ( n%3 == 0) ?"3의배수" : "3의배수 아님";
		
		System.out.printf("%d는 %s\n\n",n,mul);
		
		//설명 : n을 입력으로받고 정수를 입력시켜서 
		// 문자형 mul변수에 조건연산자로 할당시킨다.
		// 입력받은 n이 3으로 나누어서 나머지가 0이되면  3의배수를 출력
		// 0이아니면  "3의배수아님"을 출력시킨다.
		
		//2번) 두 정수를 입력해서 큰수를 판별하시오 
		int n1,n2,big;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		big = (n1 > n2)  ? n1: n2;
		
		System.out.printf("%d, %d 중 큰수는 %d\n\n",n1,n2,big);
		
		//설명 : n1,n2,big을 정수형타입으로 선언을 하고 
		//변수 big에 조건연산자를 대입시켜서 n1이 크면 n1, n2가 크면 n2를 출력한다.
		
		//3번 ) 절대값 출력
		
		int num;
		System.out.print("정수입력 : ");
		num = sc.nextInt();
		
		num = (num < 0 ) ? -num : num;
		System.out.println("절대값은 " + num);
		
		//설명
		// num을 정수형 으로 선언한뒤 스캐너에 할당시켜준다.
		// num이 0보다 작으면 참: -num을 출력 
		// num이 0보다 크면 거짓 : num을 출력
		
		
		sc.close();
		
	
	}

}
