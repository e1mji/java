package loop;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		//입력받은 정수로 소수,약수를 판별하시오.
		Scanner sc = new Scanner(System.in);
		int n, count =0;
		
		System.out.print("정수입력 :");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n%i ==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("(" + count + "개)");
		
		if (count == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수아님");
		}
		sc.close();
	}
	// 나만의 해석 : 
	// 변수 n에 정수를 입력받고 
	// 반복문을 이용해서 입력받은 정수만큼 i를 루프시키고 
	// 조건문 if로 만약 n이 i와 딱맞게 나누어떨어지면 count변수에 +시키고
	// 약수가 몇개인지 출력한다. 
	// 만약 입력받은 정수의 약수가 2개라면 1과 자기자신만 나누어지는 것이므로 
	// "소수"를 프린트한다.
					
}
