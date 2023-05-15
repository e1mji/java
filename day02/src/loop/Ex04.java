package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 불특정횟수의 반복은 무한 반복형태로도 가능하다
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("정수입력 (0:종료)");
			n = sc.nextInt();
			
			if(n==0) {
				break;		//제어문을 '즉시 탈출
							// if에는 적용x
			}
			System.out.println("n = "+ n +"\n");
		}
		sc.close();
	}

}
