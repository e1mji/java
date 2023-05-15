package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
		//1. 구구단 2단을 반복으로 출력, 단 x1 ~ x9까지
		//2. 입력문으로 전환해서 입력한 구구단이 출력되게 한다
		//3. 역순으로도 출력을 해본다
		
		Scanner sc = new Scanner(System.in);
		int i =1,dan;
		
		System.out.print("구구단 몇단?");
		dan = sc.nextInt();
		
		while (i <=9) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i++;
		}
		System.out.println();
		
		i=9;
		while (i>=1) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i--;
		}
		sc.close();
	}
	//나만의 해석:
	//변수 i는 전역변수이다.while문으로 i가 9가 될때까지 
	// dan의 변수로 입력받아서 입력받은 정수 x 반복문 i를 통해 구구단을 출력한다 
	// 첫번째 연산이 끝나면 i++을 통해 i가  증가하게되어 1,2,3,4...
	// 9단까지 출력이된다.				
	// 역순: i는 9로 변수초기화  => 마찬가지로 i--;  i가 감소하게되면서 
	// 구구단이 역순으로 출력된다.
										
}
