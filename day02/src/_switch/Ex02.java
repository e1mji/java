package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//switch는 단일 값을 처리하는 분기문
		// 즉, 범위를 처리하는데 적합하지 못하다
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 (1~10)");
		n = sc.nextInt();
		
		switch (n) {
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("홀수");
			break;

		case 2: case 4: case 6: case 8: case 10:
			System.out.println("짝수");
			break;
		}
		sc.close();
	}
	
	/*
	 * switch는 단순히 단일 값을 처리하는 분기문이다 그러므로 
	 * 마트에서 물건을 고를때처럼 코드를 집어내서 처리하는데에 효율적이다
	 * 그래서 case를 1부터10까지의 정수중 짝수와 홀수를 판별하는데에는 
	 * 코드가 길어지게되고 유지보수에 비효율적이다.
	 */

}
