package loop2;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
//		문제1) N x N 별찍기
//		입력 : 5
		/*
		 * ***** ***** ***** ***** *****
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("별 몇개?:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제 2) 직각삼각형
		// 입력 : 5
		/*
		 * * ** *** **** *****
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 문제 3) 2번을 위아래로 반전
		// 입력: 5
		/*
		 * ***** **** *** ** *
		 */

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 문제4) 2번을 좌우로 반전
		// 입력 : 5
		/*
		 *     * 
		 *    ** 
		 *   *** 
		 *  **** 
		 * *****
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		//트리
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n -1-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	}

