package operator;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//조건 연산자: 조건에 따라서 값을 '선택'하는 연산자
		//사실상 코드를 짤때 자주사용되는 것 같다
		//형태 : (조건식) ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n= sc.nextInt();
		
		String plus = (n < 0) ? "음수" : "양수";
		//plus는 n이 0보다 작으면 참: 음수,
		//plus는 n이 0보다 크면 거짓 :양수
		
		System.out.printf("%d(은)는 %s 입니다\n",n,plus);
		
		sc.close();
	}

}
