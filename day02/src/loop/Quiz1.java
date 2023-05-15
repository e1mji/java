package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 정수를 입력받아서 1~n까지 일렬로 출력하세요
		// 2. 정수를 입력받아서 1~n까지 합계를 출력
		Scanner sc = new Scanner(System.in);
		int n, i = 1, total = 0;

		System.out.print("정수입력:");
		n = sc.nextInt();

		while (i <= n) {
			System.out.print(i + " ");

			total += i;
			i++;
		}

		/*
		 * 해석 n을 입력으로 받아서 while문으로 받은 정수만큼 반복한다. 합계는 증감식을 이용해서 total변수에 복합대입연산자로 할당시켜준다.
		 */
		System.out.println("\n합계  :" + total);

		// 3.정수를 입력받아서 수를 거꾸로 출력하세요
		// ex)123 -> 출력 : 321

		int rev = 0;

		System.out.print("\n정수입력:");
		n = sc.nextInt();

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println("rev = " + rev);

//		 	예를 들어, n 이 1234일 경우:
//			첫 번째 반복: rev = 0 * 10 + 1234 % 10 = 4, n = 1234 / 10 = 123
//			두 번째 반복: rev = 4 * 10 + 123 % 10 = 43, n = 123 / 10 = 12
//			세 번째 반복: rev = 43 * 10 + 12 % 10 = 432, n = 12 / 10 = 1
//			네 번째 반복: rev = 432 * 10 + 1 % 10 = 4321, n = 1 / 10 = 0
//			
//			따라서 최종적으로 rev에는 1234를 뒤집은 4321이 저장되고, 이 값이 출력된다.

		sc.close();
	}
}
