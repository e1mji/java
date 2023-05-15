package loop;

import java.util.Scanner;

//반복의 종류
// 1. 지정 횟수 반복 : 횟수가 있는반복 ex) 5,10번 등
// 2. 불특정 횟수 반복 : 횟수가 마땅히 없는 반복.  ex)종료를 누를때까지
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		
		while (n!=0) {
			System.out.println("정수입력(0:종료)");
			n=sc.nextInt();
			
			System.out.println("n = "+ n + "\n");
		}
		sc.close();
	}
	//나만의 해석:
	// 변수 n은 1이다. n을 입력으로 받고 
	// 반복문을통해 n이0이 아니라면(NOT) 입력을 반복한다.

}
