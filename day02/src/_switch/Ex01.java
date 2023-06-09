package _switch;

import java.util.Scanner;

/*
 * 선택문 switch
 * -조건이 아닌, 값으로 코드를 분기한다
 * - 주로 메뉴를 구성할 때 자주사용된다.
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;

		while (true) {
			System.out.print("메뉴 (1~3)");
			if (sc.hasNextInt()) {
				menu = sc.nextInt();

				switch (menu) { // switch (값) : 값에는 정수와 문자열만 가능
				case 1:
					System.out.println("1번선택");
					break; // break : 제어문을 즉시 탈출
				case 2:
					System.out.println("2번 선택");
					break;
				case 3:
					System.out.println("3번 선택");
					break;
				default:
					System.out.println("없는 메뉴");
				}
			} else {
				System.out.println("올바른입력이 아닙니다.");

			}
		}
		/*
		 * switch구문으로 case를 1번부터 3번까지 지정해주고 
		 * 각각의 번수를 매겨 문자열로 출력해준다. 만약 1부터3까지의 정수가 아니라면
		 * 제어문을 통해 올바른 입력문이 아니라는 메세지를 띄워주고 while문을 이용해서 
		 * 다시 메뉴를 입력받을 수 있도록 해줬다.
		 */
	}
	
	

}
